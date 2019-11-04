package com.mycompany.mygame0;

import com.badlogic.gdx.*;
import com.badlogic.gdx.graphics.*;
import com.badlogic.gdx.graphics.g2d.*;
import com.badlogic.gdx.scenes.scene2d.ui.*;
import com.badlogic.gdx.scenes.scene2d.*;

public class MyGdxGame implements ApplicationListener
{
	//Texture texture;
	SpriteBatch batch;
	String buf;
	BitmapFont fo;
	Label lb;
	//CharSequence str = buf;
	

	@Override
	public void create()
	{
		//texture = new Texture(Gdx.files.internal("android.jpg"));
		batch = new SpriteBatch();
	}
	
	int time;

	@Override
	public void render()
	{        
		Gdx.gl.glClearColor(1,1,1,1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		//draw_label();
		
		if(Gdx.input.isTouched())
		{
				
				draw_label();
				
		}
		batch.end();
	}
	private void draw_label()
	{
			counter_num cn = new counter_num();
			
			cn.init();
	}
	@Override
	public void dispose()
	{
			batch.dispose();
			fo.dispose();
		
	}
/*
	@Override
	public void update()
	{
			
	}
	*/
	

	@Override
	public void resize(int width, int height)
	{
	}

	@Override
	public void pause()
	{
	}

	@Override
	public void resume()
	{
	}
}
