package com.xworkz.custom_dataType;

public class Submarine {
	private String name;
	private int length;
	private double maxDepth;
	private int speed;
	private boolean isMarine;

	private String World="Asia";
	private String country="India";
	private String state="Karnataka";
	private String city="mangalore";
	private String hullMaterial="steel";
	private double displacement=1800.0;
	private int crewCapacity=120;
	private String propulsion_type="nuclear";
	private boolean nuclear_powered=true;
	private int torpedo_count=24;
	private int missile_count=16;
	private int launch_year=2024;
	private String sonar_type="active";
	private double battery_capacity=500.0;
	private double surface_range=2000.0;
	private double submerged_range=1500.0;
	private String submarine_id="SSN-789";
	private String submarine_class="Attack submarine";
	private String navigation_syatem="GPS";
	private int deck_count=3;
	private String fuel_type="Nuclear fuel";
	private int maintaince_cycle=2;
	private int camera_count=80;
	private int escape_pods=4;
	private int airlock_count=32;
	private String communicationSystem="satellite communication";
	private String lifeSupportSystem="advanced";
	private int max_crew_rotation=46;
	private boolean itsEmergencySystem=true;
	private boolean oxygen_generation_system=true;


    public Submarine(String name,int length,double maxDepth,int speed,boolean isMarine) {
    	this.name=name;
    	this.length=length;
    	this.maxDepth=maxDepth;
    	this.speed=speed;
    	this.isMarine=isMarine;
	
   }
    
    public void DetailsMarine() {
    	System.out.println("submarine name is :"+this.name);
    	System.out.println("submarine length is :"+this.length);
    	System.out.println("submarine maximum detpth is :"+this.maxDepth);
    	System.out.println("submarine speed is :"+this.speed);
    	System.out.println("submarine is :"+this.isMarine);
    	System.out.println("submarine is :"+World);
    	System.out.println("submarine is :"+country);
    	System.out.println("submarine is :"+state);
    	System.out.println("submarine is :"+city);
    	System.out.println("submarine is :"+hullMaterial);
    	System.out.println("submarine is :"+displacement);
    	System.out.println("submarine is :"+crewCapacity);
    	System.out.println("submarine is :"+propulsion_type);
    	System.out.println("submarine is :"+nuclear_powered);
    	System.out.println("submarine is :"+torpedo_count);
    	System.out.println("submarine is :"+missile_count);
    	System.out.println("submarine is :"+launch_year);
    	System.out.println("submarine is :"+sonar_type);
    	System.out.println("submarine is :"+battery_capacity);
    	System.out.println("submarine is :"+surface_range);
    	System.out.println("submarine is :"+submerged_range);
    	System.out.println("submarine is :"+submarine_id);
    	System.out.println("submarine is :"+submarine_class);
    	System.out.println("submarine is :"+navigation_syatem);
    	System.out.println("submarine is :"+fuel_type);
    	System.out.println("submarine is :"+deck_count);
    	System.out.println("submarine is :"+maintaince_cycle);
    	System.out.println("submarine is :"+camera_count);
    	System.out.println("submarine is :"+escape_pods);
    	System.out.println("submarine is :"+airlock_count);
    	System.out.println("submarine is :"+communicationSystem);
    	System.out.println("submarine is :"+lifeSupportSystem);
    	System.out.println("submarine is :"+max_crew_rotation);
    	System.out.println("submarine is :"+itsEmergencySystem);
    	System.out.println("submarine is :"+oxygen_generation_system);

    }
}