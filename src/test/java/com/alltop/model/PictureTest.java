package com.alltop.model;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.alltop.constants.MediaType;

public class PictureTest {

	Picture picture;
	
	@Before
	public void setup() {
		picture = new Picture();
	}
	
	@Test
	public void test() {
		picture.setAuthor("author");
		picture.setEvent("event");
		picture.setId(1);
		picture.setTimeStamp("timestamp");
		picture.setType(MediaType.PICTURE);
		
		assertEquals("author", picture.getAuthor());
		assertEquals("event", picture.getEvent());
		assertEquals(1, picture.getId());
		assertEquals("timestamp", picture.getTimeStamp());
	}
}
