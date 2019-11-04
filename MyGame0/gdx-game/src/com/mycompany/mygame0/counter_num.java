package com.mycompany.mygame0;

import com.badlogic.gdx.*;
import com.badlogic.gdx.graphics.*;
import com.badlogic.gdx.graphics.g2d.*;
import com.badlogic.gdx.scenes.scene2d.ui.*;
import com.badlogic.gdx.scenes.scene2d.*;

import java.io.*;

public class counter_num
{
	SpriteBatch batch;
	BitmapFont bf;
	BufferedWriter bwriter;
	public counter_num(){}
	public void init()
	{
			 batch = new SpriteBatch();
			bf = new BitmapFont();
			 Label.LabelStyle ls = new Label.LabelStyle(bf, Color.BLACK);
			 Label label = new Label("YES", ls);
			 label.setPosition(100,100);
			 Stage st = new Stage();
			 st.addActor(label);
			 st.draw();
	}
	public void Wrtting()
	{

	try
			{
			File f = new File("/storage/emulated/0/item.txt");
			bwriter = new BufferedWriter(new FileWriter(f));
					bwriter.write("H");
					bwriter.close();
					}
					catch(Exception error)
			{

			}
					
	}
} 
