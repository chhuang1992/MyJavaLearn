package learnjogl;

import javax.media.opengl.GL2;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.GLProfile;
import javax.media.opengl.awt.GLCanvas;
import javax.media.opengl.glu.GLU;

import javax.swing.JFrame;
   
public class Line3d implements GLEventListener {
   private GLU glu = new GLU();
	
   @Override
   
   public void display( GLAutoDrawable drawable ) {
      final GL2 gl = drawable.getGL().getGL2();
      gl.glTranslatef( 0f, 0f, -2.5f );
      gl.glBegin( GL2.GL_LINES );
      gl.glVertex3f( -0.75f,0f,0 );
      gl.glVertex3f( 0f,-0.75f, 0 );
      gl.glEnd();
      
      //3d line
      gl.glBegin( GL2.GL_LINES );
      gl.glVertex3f( -0.75f,0f,3f );// 3 units into the window
      gl.glVertex3f( 0f,-0.75f,3f );
      gl.glEnd();
   }
   
   @Override
   public void dispose( GLAutoDrawable arg0 ) {
      //method body
   }
   
   @Override
   public void init( GLAutoDrawable arg0 ) {
      // method body
   }
   
   @Override
   public void reshape( GLAutoDrawable drawable, int x, int y, int width, int height ) {
	
      GL2 gl = drawable.getGL().getGL2();
      
      if( height <= 0 )
         height = 1;
			
      final float h = ( float ) width / ( float ) height;
      gl.glViewport( 0, 0, width, height );
      gl.glMatrixMode( GL2.GL_PROJECTION );
      gl.glLoadIdentity();
		
      glu.gluPerspective( 45.0f, h, 1.0, 20.0 );
      gl.glMatrixMode( GL2.GL_MODELVIEW );
      gl.glLoadIdentity();
   }
   
   public static void main( String[] args ) {
	
      //getting the capabilities object of GL2 profile
      final GLProfile profile = GLProfile.get( GLProfile.GL2 );
      GLCapabilities capabilities = new GLCapabilities(profile);
          
      // The canvas
      final GLCanvas glcanvas = new GLCanvas( capabilities );
      Line3d line3d = new Line3d();
      glcanvas.addGLEventListener( line3d );
      glcanvas.setSize( 400, 400 );
       
      //creating frame
      final JFrame frame = new JFrame (" 3d line");
          
      //adding canvas to it
      frame.getContentPane().add( glcanvas );
      frame.setSize(frame.getContentPane().getPreferredSize() );
      frame.setVisible( true );
   }//end of main
	
}//end of class