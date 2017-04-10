/*************************************************************
 * MonsterMash.pde
 *
 * Code to run the sketch for the MonsterMash lab.  This code  
 * takes care of the setup and draw Processing methods.  It also
 * contains code to have the Monster follow a mouse-click.  
 *
 * Students need to provide a Monster.pde file containing the 
 * implementation of the Monster class as specified in the lab.
 *
 **************************************************************/

// Global Monster reference
Monster m;

void setup()
{
   size(400,400);  // set the size of the drawing window
   m = new Monster(200, 200);  // create the Monster in the center of the screen
}

void draw()
{
   background(155, 30, 50);  // CHANGE this if you like
   m.draw();  // Tell the Monster to draw itself
   m.move();  // Tell the Monster to move itself
}

void mousePressed() 
{
   PVector v = new PVector(0,0);
   // Determine the direction between the Monster and the mouse click.
   if ((abs(mouseX-(int)m.getX()) > 20) || abs(mouseY-(int)m.getY()) > 20)
       v = new PVector(mouseX-(int)m.getX(), mouseY-(int)m.getY());
   
   // Normalize the vector to one-pixel length and set the Monster's direction.
   v.normalize();
   m.setVector(v); 
}
