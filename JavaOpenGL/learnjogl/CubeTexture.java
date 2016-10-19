package learnjogl;

import java.awt.DisplayMode;

import java.io.File;
import java.io.IOException;

import javax.media.opengl.GL2;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.GLProfile;
import javax.media.opengl.awt.GLCanvas;
import javax.media.opengl.glu.GLU;

import javax.swing.JFrame;

import com.jogamp.opengl.util.FPSAnimator;
import com.jogamp.opengl.util.texture.Texture;
import com.jogamp.opengl.util.texture.TextureIO;

public class CubeTexture implements GLEventListener {

   public static DisplayMode dm, dm_old;
   private GLU glu = new GLU();
   private float xrot,yrot,zrot;
   private int texture1;
   private int texture2;
   private int texture3;
   private int texture4;
   private int texture5;
   private int texture6;
   
   @Override
   public void display(GLAutoDrawable drawable) {
   
      // TODO Auto-generated method stub
      final GL2 gl = drawable.getGL().getGL2();
      gl.glClear(GL2.GL_COLOR_BUFFER_BIT | GL2.GL_DEPTH_BUFFER_BIT);
      gl.glLoadIdentity(); // Reset The View
      gl.glTranslatef(0f, 0f, -5.0f);
		
      gl.glRotatef(xrot, 1.0f, 1.0f, 1.0f);
      gl.glRotatef(yrot, 0.0f, 1.0f, 0.0f);
      gl.glRotatef(zrot, 0.0f, 0.0f, 1.0f);
		
      //gl.glBindTexture(GL2.GL_TEXTURE_2D, texture1);
      gl.glBegin(GL2.GL_QUADS);

      // Front Face
      gl.glBindTexture(GL2.GL_TEXTURE_2D, texture1);
      gl.glTexCoord2f(0.0f, 0.0f); gl.glVertex3f(-1.0f, -1.0f, 1.0f);
      gl.glTexCoord2f(1.0f, 0.0f); gl.glVertex3f( 1.0f, -1.0f, 1.0f);
      gl.glTexCoord2f(1.0f, 1.0f); gl.glVertex3f( 1.0f, 1.0f, 1.0f);
      gl.glTexCoord2f(0.0f, 1.0f); gl.glVertex3f(-1.0f, 1.0f, 1.0f);

      // Back Face
      gl.glBindTexture(GL2.GL_TEXTURE_2D, texture2);
      gl.glTexCoord2f(1.0f, 0.0f); gl.glVertex3f(-1.0f, -1.0f, -1.0f);
      gl.glTexCoord2f(1.0f, 1.0f); gl.glVertex3f(-1.0f, 1.0f, -1.0f);
      gl.glTexCoord2f(0.0f, 1.0f); gl.glVertex3f( 1.0f, 1.0f, -1.0f);
      gl.glTexCoord2f(0.0f, 0.0f); gl.glVertex3f( 1.0f, -1.0f, -1.0f);

      // Top Face
      gl.glBindTexture(GL2.GL_TEXTURE_2D, texture3);
      gl.glTexCoord2f(0.0f, 1.0f); gl.glVertex3f(-1.0f, 1.0f, -1.0f);
      gl.glTexCoord2f(0.0f, 0.0f); gl.glVertex3f(-1.0f, 1.0f, 1.0f);
      gl.glTexCoord2f(1.0f, 0.0f); gl.glVertex3f( 1.0f, 1.0f, 1.0f);
      gl.glTexCoord2f(1.0f, 1.0f); gl.glVertex3f( 1.0f, 1.0f, -1.0f);

      // Bottom Face
      gl.glBindTexture(GL2.GL_TEXTURE_2D, texture4);
      gl.glTexCoord2f(1.0f, 1.0f); gl.glVertex3f(-1.0f, -1.0f, -1.0f);
      gl.glTexCoord2f(0.0f, 1.0f); gl.glVertex3f( 1.0f, -1.0f, -1.0f);
      gl.glTexCoord2f(0.0f, 0.0f); gl.glVertex3f( 1.0f, -1.0f, 1.0f);
      gl.glTexCoord2f(1.0f, 0.0f); gl.glVertex3f(-1.0f, -1.0f, 1.0f);

      // Right face
      gl.glBindTexture(GL2.GL_TEXTURE_2D, texture5);
      gl.glTexCoord2f(1.0f, 0.0f); gl.glVertex3f( 1.0f, -1.0f, -1.0f);
      gl.glTexCoord2f(1.0f, 1.0f); gl.glVertex3f( 1.0f, 1.0f, -1.0f);
      gl.glTexCoord2f(0.0f, 1.0f); gl.glVertex3f( 1.0f, 1.0f, 1.0f);
      gl.glTexCoord2f(0.0f, 0.0f); gl.glVertex3f( 1.0f, -1.0f, 1.0f);

      // Left Face
      gl.glBindTexture(GL2.GL_TEXTURE_2D, texture6);
      gl.glTexCoord2f(0.0f, 0.0f); gl.glVertex3f(-1.0f, -1.0f, -1.0f);
      gl.glTexCoord2f(1.0f, 0.0f); gl.glVertex3f(-1.0f, -1.0f, 1.0f);
      gl.glTexCoord2f(1.0f, 1.0f); gl.glVertex3f(-1.0f, 1.0f, 1.0f);
      gl.glTexCoord2f(0.0f, 1.0f); gl.glVertex3f(-1.0f, 1.0f, -1.0f);
      gl.glEnd();
      gl.glFlush();

      //change the speeds here
      xrot += .1f;
      yrot += .1f;
      zrot += .1f;
   }
   
   @Override
   public void dispose(GLAutoDrawable drawable) {
      // method body
   }
   
   @Override
   public void init(GLAutoDrawable drawable) {
	
      final GL2 gl = drawable.getGL().getGL2();
		
      gl.glShadeModel(GL2.GL_SMOOTH);
      gl.glClearColor(0f, 0f, 0f, 0f);
      gl.glClearDepth(1.0f);
      gl.glEnable(GL2.GL_DEPTH_TEST);
      gl.glDepthFunc(GL2.GL_LEQUAL);
      gl.glHint(GL2.GL_PERSPECTIVE_CORRECTION_HINT, GL2.GL_NICEST);
      
      //
      gl.glEnable(GL2.GL_TEXTURE_2D);
      try{
		
         File im1 = new File("lbb01.jpg ");
         Texture t1 = TextureIO.newTexture(im1, true);
         texture1= t1.getTextureObject(gl);
         File im2 = new File("lbb02.jpg ");
         Texture t2 = TextureIO.newTexture(im2, true);
         texture2= t2.getTextureObject(gl);
         File im3 = new File("lbb03.jpg ");
         Texture t3 = TextureIO.newTexture(im3, true);
         texture3= t3.getTextureObject(gl);
         File im4 = new File("lbb04.jpg ");
         Texture t4 = TextureIO.newTexture(im4, true);
         texture4= t4.getTextureObject(gl);
         File im5 = new File("lbb05.jpg ");
         Texture t5 = TextureIO.newTexture(im5, true);
         texture5= t5.getTextureObject(gl);
         File im6 = new File("lbb06.jpg ");
         Texture t6 = TextureIO.newTexture(im6, true);
         texture6= t6.getTextureObject(gl);
          
      }catch(IOException e){
         e.printStackTrace();
      }
   }
      
   @Override
   public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
   
      // TODO Auto-generated method stub
      final GL2 gl = drawable.getGL().getGL2();
      if(height<= 0)
         height = 1;
			
      final float h = (float) width / (float) height;
      gl.glViewport(0, 0, width, height);
      gl.glMatrixMode(GL2.GL_PROJECTION);
      gl.glLoadIdentity();
		
      glu.gluPerspective(45.0f, h, 1.0, 20.0);
      gl.glMatrixMode(GL2.GL_MODELVIEW);
      gl.glLoadIdentity();
   }
   
   public static void main(String[] args) {
   
      // TODO Auto-generated method stub
      final GLProfile profile = GLProfile.get(GLProfile.GL2);
      GLCapabilities capabilities = new GLCapabilities(profile);
      
      // The canvas
      final GLCanvas glcanvas = new GLCanvas(capabilities);
      CubeTexture r = new CubeTexture();
		
      glcanvas.addGLEventListener(r);
      glcanvas.setSize(400, 400);
		
      final JFrame frame = new JFrame (" Textured Cube");
      frame.getContentPane().add(glcanvas);
      frame.setSize(frame.getContentPane().getPreferredSize());
      frame.setVisible(true);
      final FPSAnimator animator = new FPSAnimator(glcanvas, 300, true);
		
      animator.start();
   }
	
}