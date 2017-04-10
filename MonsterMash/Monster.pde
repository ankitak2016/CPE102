class Monster{
  PVector direction;
  double x;
  double y;
  
  public Monster(double x, double y){
    this.x=x;
    this.y=y;
    direction = new PVector(0,0);
  }
  
  public void draw(){
 
       pushMatrix();
       translate((int)x, (int)y);
        
       noStroke();
       
       //fill(255,255,0);
       //arc(0, 0, 40, 40, QUARTER_PI, PI+3*QUARTER_PI, PIE);
       // head
       fill(0,128,255);
       //rotate(PI);
       arc(0,0,21,40,0,PI,PIE);
       //triangle(

       // eyes
       //fill(255);
       //ellipse(-5,-3,4,4);
       //ellipse(5,-3,4,4);
       //fill(0);
       //ellipse(-5, -3, 2, 2);
       //ellipse(5, -3, 2, 2);

        
       //nose
       //fill(0);
      //ellipse(0, 4, 3, 3);
        
       //teeth
       //pushMatrix();
       //fill(255);
       //rotate(PI);
       //triangle(-7, -8, -5, -13, -3, -8);
       //triangle(-3,-8,0,-13,3,-8);
       //triangle(7, -8, 5, -13, 3, -8);
       //popMatrix();
        
       // eyebrows
       //fill(0);
       //ellipse(-10, -10, 10, 4);
       //ellipse(10, -10, 10, 4);
       //fill(0,128,255);
       //ellipse(-10, -10, 7, 3);
       //ellipse(10, -10, 7, 3);
        
       popMatrix();
  }
  
  public double getX(){
    return x;
  }
  
  public double getY(){
    return y;
  }
  
  public void move(){
   x=x+direction.x;
   y=y+direction.y;
    
  }
  
  public void setVector(PVector direction){
   this.direction = direction;
  }
}