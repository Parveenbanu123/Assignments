package com.mphasis;

import java.io.File;
import java.io.IOException;

public class DemoOnFiles {

	public static void main(String[] args) throws IOException {
			File dir=new File("assets");
			if(!dir.exists())
				dir.mkdir();
			
			File f=new File(dir,"data.txt");
			System.out.println(f.createNewFile());
			System.out.println(f.exists());
			System.out.println(f.isFile());
			System.out.println(f.isDirectory());
			System.out.println(f.getName());
			System.out.println(f.getParent());//null because we created data.txt directly 
			System.out.println(f.getAbsolutePath());//C:\Users\s.parveenbanu\eclipse-workspace\MavenProject7\data.txt
			System.out.println(f.getPath());//data.txt
			System.out.println(f.length());
			System.out.println(f.canRead());
			System.out.println(f.canWrite());
			System.out.println(f.canExecute());
			System.out.println();

	}

}
