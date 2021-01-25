package com.neuedu.part11;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 文件与流
 * java.io包
 * 1.文件
 * File类 提供一个指定文件路径的构造方法，用来创建对应文件的引用，用来操作文件内容
 * new File(String pathname)全路径
 * new File(URI uri)文件url
 * new File(String parent,String child)父子路径
 * createNewFile()创建文件
 * exists()判断文件是否存在
 * delete()删除文件
 * mkdirs()创建文件夹
 * \（反斜杠）和/的区别：\代表windows系统的文件路径，/代表linux系统的文件路径
 * 不同系统的斜杠适配问题
 * 2.流
 * 根据传输方向的不同，分为输入流输出流
 * 根据传输类型的不同，分为字符流，字节流
 * 根据传输功能的不同，分为节点流，处理流
 * 类型➡功能➡方向
 * 字节流
 *  ⬇  ➡ 节点流 ➡  输入流 FileInputStream  
 *              read()一次读一个字节，如果没有东西则返回-1  
 *              read(byte[])一次读多个字节
 *              read(byte[in.available()])一次读全部字节  available()自动识别当前文件大小
 *             输出流 FileOutputStream
 *              write()一次写一个
 *              write(byte[])一次写多个
 *      
 *  ⬇  ➡ 处理流(是基于节点流来使用，构造函数中需要传入一个节点流对应的对象) 
 *           ➡ 输入流 BufferedInputStream
 *           新增了一个缓冲区功能，需要把内容调用flush()刷新方法写入文件
 *             输出流 BufferedOutputStream
 * 字符流    节点流      输入流 FileReader
 *             输出流 FileWriter 需要刷新flush()
 *      处理流         输入流 readLine()一次读一行
 *             输出流     
 * 输入流输出要转型成char才能输出
 * 通常输入流输出流是用于复制
 *
 */

public class Test0122 {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("C:"+File.separator+"study"+File.separator+"java2"+File.separator+"workspace"+File.separator+"aaa.txt");
		File file2=new File("C:"+File.separator+"study"+File.separator+"java2"+File.separator+"workspace"+File.separator+"bbb.txt");
		//字节流
		//File.separator代表斜杠
		/*
		if(file.exists()){//判断文件是否存在
			System.out.println("已存在");
			file.delete();//删除文件
		}
		//file.createNewFile();//创建文件
		if(!file.exists()){
			file.mkdirs();
		}
		*/
		/*
		if(!file.exists()){
			file.createNewFile();
		}
		FileInputStream fileInputStream = new FileInputStream(file);
		int read = fileInputStream.read();//读取文件内容，一次读一个字节
		while(read!=-1){
			System.out.print((char)read);
			read = fileInputStream.read();
		}
		fileInputStream.close();
		*/
		/*
		FileInputStream fileInputStream = new FileInputStream(file);
		byte[] bt=new byte[8];//一次读多个字节
		int read = fileInputStream.read(bt);
		while(read!=-1){
			for(byte item:bt){
				System.out.print((char)item);
				read = fileInputStream.read(bt);
			}
		}
		fileInputStream.close();
		*/
		/*
		FileInputStream fileInputStream = new FileInputStream(file);//构建字节流里节点流的输入流读file中的字节
		FileOutputStream fileOutputStream = new FileOutputStream(file2);//构建输出流将字节写入file2中
		BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);//构建处理流的输入流
		BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);//构建处理流的输出流
		byte[] bt=new byte[fileInputStream.available()];//设置为一次读全部字节
		int read = fileInputStream.read(bt);//一次读取全部字节
		int read2=bufferedInputStream.read(bt);//处理流读取字节
		//fileOutputStream.write(bt);//写入字节
		bufferedOutputStream.write(bt);//处理流写入字节
		bufferedOutputStream.flush();//处理流需要刷新
		while(read!=-1){
			for(byte item:bt){
				System.out.print((char)item);
				read = fileInputStream.read(bt);
			}
		}
		fileInputStream.close();//关闭流
		fileOutputStream.close();
		bufferedOutputStream.close();
		bufferedInputStream.close();
		
		*/
		
		//字符流
		
		char[] cbuf=new char[1024];//一次读多个
		FileReader fileReader = new FileReader(file);//构建字符流里节点流的输入流
		FileWriter filewriter=new FileWriter(file2);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		BufferedWriter bufferedWriter = new BufferedWriter(filewriter);
		int read = fileReader.read(cbuf);
		//filewriter.write(cbuf);
		filewriter.flush();
		String readLine = bufferedReader.readLine();//一次读一行
		while(readLine!=null){
			bufferedWriter.write(readLine);
			bufferedWriter.flush();
			readLine = bufferedReader.readLine();
		}
		
		while(read!=-1){
			System.out.print(cbuf);
			read = fileReader.read(cbuf);
		}
		fileReader.close();
		filewriter.close();
		bufferedReader.close();
		bufferedWriter.close();
		

	}

}
