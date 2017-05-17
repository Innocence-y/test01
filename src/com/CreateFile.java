package com;


import java.io.File;
import java.io.IOException;

/**
 * Created by WWWW on 2017/5/8.
 */
public class CreateFile {
	public static void main(String[] args) {
		File file=new File(FileUtil.FILE_NAME);
		if (!file.exists()){
			try {
				file.createNewFile();
				System.out.println("文件成功创建");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}else
			System.out.println("已存在");
			System.out.println("文件名为"+file.getName());
			System.out.println("路径为"+file.getAbsolutePath());
			System.out.println("相对路径为"+file.getPath());
			System.out.println(""+file.getParent());
		}
	}
}
