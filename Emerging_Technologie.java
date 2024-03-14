class Emerging_Technologie {  
    void EmTecH() {
        System.out.println("Welcome To Emergicon..");
    }  
}

class AIML extends Emerging_Technologie {  
    void ML() {
        System.out.println("Welcome To AIML of Emerging_TecH");
    }  
}

class AIDS extends Emerging_Technologie {  
    void DS() {
        System.out.println("Welcome To AIDS of Emerging_TecH");
    }  
}

class CSE extends Emerging_Technologie {  
    void CS() {
        System.out.println("Welcome To CSE of Emerging_TecH");
    }  
}

class Hierarchical {  
    public static void main(String args[]) {  
        AIML aiml = new AIML();
        AIDS aids = new AIDS();
        CSE cse = new CSE();
        
        aiml.ML();
        aids.DS();
        cse.CS();
    }  
} 
