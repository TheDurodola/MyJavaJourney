import java.util.Scanner;

public class NokiaBack{
public static void main(String[]args){

Scanner input = new Scanner(System.in);
int mainBack=1;
while(mainBack!=0){

String mainMenu = """
          
	 WELCOME TO NOKIA 3310 MAIN MENU
 
1=> Phone book
2=> Messages
3=> Chat
4=> Call register
5=> Tones
6=> Settings
7=> Call divert
8=> Games
9=> Calculator
10=> Reminders
11=> Clock
12=> Profiles
13=> SIM services

Enter any number listed to move or Enter 0 to back:  """;
System.out.print(mainMenu);
int navigate = input.nextInt();
if(navigate==0){mainBack=mainBack-1;}
switch(navigate){




case 1: {
int phonebookBack=1;
while(phonebookBack!=0){
String phoneBookMenu = """
          
	 PHONEBOOK MENU
 
1=> Search
2=> Service Nos
3=> Add name
4=> Erase
5=> Edit
6=> Assign tone
7=> Send b'card
8=> Options
9=> Speed dials
10=> Voice tags

Enter any number listed to move or Enter 0 to back: : """;
System.out.print(phoneBookMenu);
int phoneNavigate = input.nextInt();
if(phoneNavigate==0){phonebookBack=phonebookBack-1;}
switch(phoneNavigate){

case 1: {String search = """
		     
	SEARCH	     

""";
System.out.print(search);
navigate = input.nextInt();
break;}


case 2: {String serviceNos = """
 	     
	SERVICE NOS	     
 
""";
System.out.print(serviceNos);
navigate= input.nextInt();
break;}


case 3: {String addName = """
 
	ADD NAME	     
    	     	     
""";
System.out.print(addName);
navigate = input.nextInt();
break;}




case 4: {String erase = """
          	     
	ERASE    
    	     	     
""";
System.out.print(erase);
navigate = input.nextInt();
break;}



case 5: {String edit = """
           
	EDIT	     
    	    
""";
System.out.print(edit);
navigate = input.nextInt();
break;}




case 6: {String assignTone = """
		     
	ASSIGN TONE	     

""";
System.out.print(assignTone);
navigate = input.nextInt();
break;}



case 7: {String sendBCard = """
     
	SEND B'CARD	     
		     
""";
System.out.print(sendBCard);
navigate = input.nextInt();
break;}


case 8: {
int optionsBack = 1; 
while(optionsBack!=0){
String options = """
          
	 OPTIONS MENU
 
1=> Type of view
2=> Memory Status

Enter any number listed to move or Enter 0 to back: : """;
System.out.print(options);
navigate = input.nextInt();
if(navigate==0){optionsBack=optionsBack-1;}
switch(navigate){
case 1: {String typeOfView = """
     
	TYPE OF VIEW	     
		     
""";
System.out.print(typeOfView);
navigate = input.nextInt();
break;}

case 2: {String memoryStatus = """
     
	MEMORY STATUS	     
		     
""";
System.out.print(memoryStatus);
navigate = input.nextInt();
break;}}}
break;}

case 9: {String speedDials = """
     
	SPEED DIALS	     
		     
""";
System.out.print(speedDials);
navigate = input.nextInt();
break;}

case 10: {String voiceTags = """
     
	VOICE TAGS	     
		     
""";
System.out.print(voiceTags);
navigate = input.nextInt();
break;}}
}break;}


case 2: {
int messageBack=1;
while(messageBack!=0){
String messagesMenu = """
          
	 MESSAGES MENU
 
1=> Write messages
2=> Inbox
3=> Outbox
4=> Picture messages
5=> Templates
6=> Smileys
7=> Message settings
8=> Info service
9=> Voice mailbox number
10=>Service command editor

Enter any number listed to move or Enter 0 to back: : """;
System.out.print(messagesMenu);
int messagesNavigate = input.nextInt();
if(messagesNavigate==0){messageBack=messageBack-1;}
switch(messagesNavigate){

case 1: {String writeMessages = """
     
	WRITE MESSAGES     
		     
""";
System.out.print(writeMessages);
navigate = input.nextInt();
break;}

case 2: {String inbox = """
     
	INBOX	     
		     
""";
System.out.print(inbox);
navigate = input.nextInt();
break;}

case 3: {String outbox = """
     
	OUTBOX	     
		     
""";
System.out.print(outbox);
navigate = input.nextInt();
break;}

case 4: {String pictureMessages = """
     
	PICTURE MESSAGES	     
		     
""";
System.out.print(pictureMessages);
navigate = input.nextInt();
break;}

case 5: {String templates = """
     
	TEMPLATES	     
		     
""";
System.out.print(templates);
navigate = input.nextInt();
break;}

case 6: {String smileys = """
     
	SMILEYS	     
		     
""";
System.out.print(smileys);
navigate = input.nextInt();
break;}


case 7: {
int messageSettingBack = 1;
while(messageSettingBack!=0){
String messagesSettings = """

	MESSAGES SETTINGS MENU

1=> Set
2=> Common

Enter any number listed to move or Enter 0 to back: : """;
System.out.print(messagesSettings);
int messageSettingNavigate = input.nextInt();
if(messageSettingNavigate==0){messageSettingBack=messageSettingBack-1;}
switch(messageSettingNavigate){
case 1: {
int setBack = 1;
while(setBack!=0){
String setMenu = """  
	
	  SET
1=> Message centre number
2=> Messages sent as 
3=> Message validity

Enter any number listed to move or Enter 0 to back: : """;
System.out.print(setMenu);
int setNavigate = input.nextInt();
if(setNavigate==0){setBack=setBack-1;}
switch(setNavigate){
case 1:{String messageCentreNumber = """

	MESSAGES CENTRE NUMBER
""";
System.out.print(messageCentreNumber);
navigate = input.nextInt();
break;}
case 2:{String messageSentAs = """

	MESSAGES SENT AS
""";
System.out.print(messageSentAs);
navigate = input.nextInt();
break;}

case 3:{String messageValidity = """

	MESSAGES VALIDITY
""";
System.out.print(messageValidity);
//navigate = input.nextInt();
break;}
}}break;}

case 2: {
int commonBack = 1;
while(commonBack!=0){
String common = """

	COMMON
1=> Delivery reports
2=> Reply via same centre
3=> Character support

Enter any number listed to move or Enter 0 to back: : """;
System.out.println(common);
int commonNavigate = input.nextInt();
if(commonNavigate==0){commonBack=commonBack-1;}
switch(commonNavigate){
case 1: {String deliveryReports = """  
	
	DELIVERY REPORTS
""";
System.out.print(deliveryReports);
navigate = input.nextInt();
break;}

case 2: {String replyViaSameCentre = """  
	
	REPLY VIA SAME CENTRE
""";
System.out.print(replyViaSameCentre);
navigate = input.nextInt();
break;}

case 3: {String characterSupport = """  
	
	CHARACTER SUPPORT
""";
System.out.print(characterSupport);
navigate = input.nextInt();
break;}}
}

break;}
}
break;}
break;}
case 8: {String infoService = """  
	
	INFO SERVICE
""";
System.out.print(infoService);
navigate = input.nextInt();
break;}

case 9: {String voiceMailBoxNumber = """  
	
	VOICE MAILBOX NUMBER
""";
System.out.print(voiceMailBoxNumber);
navigate = input.nextInt();
break;}


case 10: {String serviceCommandEditor = """  
	
	SERVICE COMMAND EDITOR
""";
System.out.print(serviceCommandEditor);
navigate = input.nextInt();
break;}}
}
break;}


case 3: {String chatMenu = """  
	CHAT
""";
System.out.print(chatMenu);
navigate = input.nextInt();
break;}


case 4: {
int callRegisterBack=1;
while(callRegisterBack!=0){
String callRegisterMenu = """
          
	 CALL REGISTER MENU
 
1=> Missed calls
2=> Received calls
3=> Dialled numbers
4=> Erase recent call lists
5=> Show call duration
6=> Show call costs
7=> Call cost settings
8=> Prepaid credit

Enter any number listed to move or Enter 0 to back: : """;
System.out.print(callRegisterMenu);
int callRegisterNavigate = input.nextInt();
if(callRegisterNavigate==0){callRegisterBack=callRegisterBack-1;}
switch(callRegisterNavigate){
case 1:{String missedCalls = """

	MISSED CALLS
""";
System.out.print(missedCalls);
navigate = input.nextInt();
break;}
case 2:{String receivedCalls = """

	RECEIVED CALLS
""";
System.out.print(receivedCalls);
navigate = input.nextInt();
break;}

case 3:{String dialledCalls = """

	DIALLED CALLS
""";
System.out.print(dialledCalls);
navigate = input.nextInt();
break;}

case 4:{String eraseRecentCallLists = """

	ERASE RECENT CALL LISTS
""";
System.out.print(eraseRecentCallLists);
navigate = input.nextInt();
break;}

case 5:{
int showCallDurationBack = 1;
while(showCallDurationBack!=0){
String showCallDuration =""" 

	SHOW CALL DURATION

1=> Last call duration
2=> All calls' duration
3=> Received calls' duration
4=> Dialled calls' duration
5=> Clear timers

Enter any number listed to move or Enter 0 to back: : """;
System.out.print(showCallDuration);
int showCallDurationNavigate = input.nextInt();
switch(showCallDurationNavigate){
case 1: {String lastCallDuration = """ 

	LAST CALL DURATION

""";
System.out.print(lastCallDuration);
navigate = input.nextInt();
break;
}

case 2: {String allCallDuration = """ 

	ALL CALL DURATION

""";
System.out.print(allCallDuration);
navigate = input.nextInt();
break;
}

case 3: {String receivedCallDuration = """ 

	RECEIVED CALL DURATION

""";
System.out.print(receivedCallDuration);
navigate = input.nextInt();
break;
}

case 4: {String dialledCallDuration = """ 

	DIALLED CALL DURATION

""";
System.out.print(dialledCallDuration);
navigate = input.nextInt();
break;
}

case 5: {String clearTimers = """ 

	CLEAR TIMERS

""";
System.out.print(clearTimers);
navigate = input.nextInt();
break;
}
}
break;}
break;}

case 6: {String showCallCost =""" 

	SHOW CALL COST

1=> Last call cost
2=> All calls' cost
3=> Clear counters

Enter any number listed to move or Enter 0 to back: : """;
System.out.print(showCallCost);
int showCallCostNavigate = input.nextInt();
switch(showCallCostNavigate){
case 1: {String lastCallCost = """ 

	LAST CALL COST

""";
System.out.print(lastCallCost);
//navigate = input.nextInt();
break;
}

case 2: {String allCallsCost = """ 

	ALL CALLS COST

""";
System.out.print(allCallsCost);
//navigate = input.nextInt();
break;
}

case 3: {String clearCounters = """ 

	CLEAR COUNTERS

""";
System.out.print(clearCounters);
//navigate = input.nextInt();
break;
}

}}
case 7: {
int showCallCostback = 1;
while(showCallCostback!=0){
String showCallCostSettings =""" 

	SHOW CALL COST SETTINGS

1=> Call cost limit
2=> Show costs in

Enter any number listed to move or Enter 0 to back: : """;
System.out.print(showCallCostSettings);
int showCallCostSettingsNavigate = input.nextInt();
if(showCallCostSettingsNavigate==0){showCallCostback=showCallCostback-1;} 
switch(showCallCostSettingsNavigate ){
case 1:{String callCostLimit = """ 

	CALL COST LIMIT

""";
System.out.print(callCostLimit);
navigate = input.nextInt();
break;}

case 2:{String showCostIn = """ 

	COST IN

""";
System.out.print(showCostIn);
navigate = input.nextInt();
break;
}
}}}

case 8: {String prepaidCredit = """ 

	PREPAID CREDIT

""";
System.out.print(prepaidCredit);
//navigate = input.nextInt();
break;
}


}
} // for the callRegister switch

break;} // break for the callRegister string


case 5: {
int tonesBack=1;
while(tonesBack!=0){
String tones = """
          
	 TONES
 
1=> Ringing tone
2=> Ringing volume
3=> Incoming call alert
4=> Composer
5=> Message alert tone
6=> Keypad tones
7=> Warning and game tones
8=> Vibrating alert
9=> Screen saver

Enter any number listed to move or Enter 0 to back: : """;
System.out.print(tones);
int tonesNavigate = input.nextInt();
if(tonesNavigate==0){tonesBack=tonesBack-1;}
switch(tonesNavigate){
case 1:{String ringingTone = """
		     
	RINGING TONE	     

""";
System.out.print(ringingTone);
navigate = input.nextInt();
break;}

case 2:{String ringingvolume = """
		     
	RINGING VOLUME	     

""";
System.out.print(ringingvolume);
navigate = input.nextInt();
break;}

case 3:{String incomingCallAlert = """
		     
	INCOMING CALL ALERT	     

""";
System.out.print(incomingCallAlert);
navigate = input.nextInt();
break;}

case 4:{String composer = """
		     
	COMPOSER	     

""";
System.out.print(composer);
navigate = input.nextInt();
break;}

case 5:{String messageAlertTone = """
		     
	MESSAGE ALERT TONE	     

""";
System.out.print(messageAlertTone);
navigate = input.nextInt();
break;}

case 6:{String keypadTones = """
		     
	KEYPAD TONES	     

""";
System.out.print(keypadTones);
navigate = input.nextInt();
break;}

case 7:{String warningAndGameTones = """
		     
	WARNING AND GAME TONES	     

""";
System.out.print(warningAndGameTones);
navigate = input.nextInt();
break;}

case 8:{String vibratingAlert = """
		     
	VIBRATING ALERT	     

""";
System.out.print(vibratingAlert);
navigate = input.nextInt();
break;}

case 9:{String screenSaver = """
		     
	SCREEN SAVER	     

""";
System.out.print(screenSaver);
navigate = input.nextInt();
break;}
}}
break;}


case 6: {
int settingsBack=1;
while(settingsBack!=0){
String settings = """
          
	 SETTINGS
 
1=> Call settings
2=> Phone settings
3=> Security settings
4=> Restore factory settings


Enter any number listed to move or Enter 0 to back: : """;
System.out.print(settings);
int settingsNavigate = input.nextInt();
if(settingsNavigate==0){settingsBack=settingsBack-1;}
switch(settingsNavigate){
case 1: {
int callSettingsBack=1;
while(callSettingsBack!=0){
String callSettings = """
		     
	CALL SETTINGS	     

1=> Automatic redial
2=> Speed dialling
3=> Call waiting options
4=> Own number sending
5=> Phone line in use
6=> Automatic answer


Enter any number listed to move or Enter 0 to back: :""";
System.out.print(callSettings);
int callSettingsNavigate = input.nextInt();
if(callSettingsNavigate==0){callSettingsBack=callSettingsBack-1;}
switch(callSettingsNavigate ){
case 1: {String automaticRedial = """
		     
	AUTOMATIC REDIAL	     

""";
System.out.print(automaticRedial);
navigate = input.nextInt();
break;}

case 2: {String speedDialling = """
		     
	SPEED DIALLING	     

""";
System.out.print(speedDialling);
navigate = input.nextInt();
break;}

case 3: {String callWaitingOptions = """
		     
	CALL WAITING OPTIONS	     

""";
System.out.print(callWaitingOptions);
navigate = input.nextInt();
break;}

case 4: {String ownNumberSending = """
		     
	OWN NUMBER SENDING	     

""";
System.out.print(ownNumberSending);
navigate = input.nextInt();
break;}

case 5: {String phoneLineInUse = """
		     
	PHONE LINE~IN~USE	     

""";
System.out.print(phoneLineInUse);
navigate = input.nextInt();
break;}

case 6: {String automaticAnswer = """
		     
	AUTOMATIC ANSWER	     

""";
System.out.print(automaticAnswer);
navigate = input.nextInt();
break;}

}}
break;}

case 2: {
int phoneSettingsBack=1;
while(phoneSettingsBack!=0){
String phoneSettings = """
		     
	PHONE SETTINGS	     

1=> Language
2=> Cell info display
3=> Welcome note
4=> Network selection
5=> Lights?
6=> Confirm SIM service actions

Enter any number listed to move or Enter 0 to back: :""";
System.out.print(phoneSettings);
int phoneSettingsNavigate = input.nextInt();
if(phoneSettingsNavigate==0){phoneSettingsBack=phoneSettingsBack-1;}
switch(phoneSettingsNavigate){
case 1: {String language = """
		     
	LANGUAGE	     

""";
System.out.print(language);
navigate = input.nextInt();
break;}

case 2: {String cellInfoDisplay = """
		     
	CELL INFO DISPLAY	     

""";
System.out.print(cellInfoDisplay);
navigate = input.nextInt();
break;}

case 3: {String welcomeNote= """
		     
	WELCOME NOTE	     

""";
System.out.print(welcomeNote);
navigate = input.nextInt();
break;}

case 4: {String networkSelection = """
		     
	NETWORK SELECTION	     

""";
System.out.print(networkSelection);
navigate = input.nextInt();
break;}

case 5: {String lights = """
		     
	LIGHTS	     

""";
System.out.print(lights);
navigate = input.nextInt();
break;}

case 6: {String confirmSIM = """
		     
	CONFIRM SIM SERVICES ACTIONS	     

""";
System.out.print(confirmSIM);
navigate = input.nextInt();
break;}}
}//switch
break;}

case 3: {
int securitySettingsBack=1;
while(securitySettingsBack!=0){
String securitySettings = """
		     
	SECURITY SETTINGS	     

1=> PIN code request
2=> Call barring service
3=> Fixed dialling
4=> Closed user group
5=> Phone security
6=> Change access codes

Enter any number listed to move or Enter 0 to back: :""";
System.out.print(securitySettings);
int securitySettingsNavigate = input.nextInt();
if(securitySettingsNavigate==0){securitySettingsBack=securitySettingsBack-1;}
switch(securitySettingsNavigate){
case 1:{String pinCodeRequest = """
		     
	PIN CODE REQUEST	     

""";
System.out.print(pinCodeRequest);
navigate = input.nextInt();
break;}

case 2:{String callBarringService = """
		     
	CALL BARRING SERVICE	     

""";
System.out.print(callBarringService);
navigate = input.nextInt();
break;}

case 3:{String fixedDialling = """
		     
	FIXED DIALLING	     

""";
System.out.print(fixedDialling);
navigate = input.nextInt();
break;}

case 4:{String closedUserGroup = """
		     
	CLOSED USER GROUP	     

""";
System.out.print(closedUserGroup);
navigate = input.nextInt();
break;}

case 5:{String phoneSecurity = """
		     
	PHONE SECURITY	     

""";
System.out.print(phoneSecurity);
navigate = input.nextInt();
break;}

case 6:{String changeAccessCode = """
		     
	CHANGE ACCESS CODE	     

""";
System.out.print(changeAccessCode);
navigate = input.nextInt();
break;}
}
}break;}

case 4:{String restoreFactorySettings = """
		     
	RESTORE FACTORY SETTINGS	     

""";
System.out.print(restoreFactorySettings);
navigate = input.nextInt();
break;}
}
}break;} //leave


case 7:{String callDivert = """
		     
	CALL DIVERT	     

""";
System.out.print(callDivert);
navigate = input.nextInt();
break;}


case 8:{String games = """
		     
	GAMES	     

""";
System.out.print(games);
navigate = input.nextInt();
break;}
case 9:{String calculator = """
		     
	CALCULATOR	     

""";
System.out.print(calculator);
navigate = input.nextInt();
break;}
case 10:{String reminders = """
		     
	REMINDERS	     

""";
System.out.print(reminders);
navigate = input.nextInt();
break;}

case 11: {
int clockBack=1;
while(clockBack!=0){
String clock = """
          
	 CLOCK
 
1=> Alarm clock
2=> Clock settings
3=> Date setting
4=> Stopwatch
5=> Countdown timer
6=> Auto update of date and time


Enter any number listed to move or Enter 0 to back: : """;
System.out.print(clock);
int clockNavigate = input.nextInt();
if(clockNavigate==0){clockBack=clockBack-1;}
switch(clockNavigate){
case 1:{
String alarmClock = """
		     
	ALARM CLOCK	     

""";
System.out.print(alarmClock);
navigate = input.nextInt();
break;}

case 2:{
String clockSettings = """
		     
	CLOCK SETTINGS	     

""";
System.out.print(clockSettings);
navigate = input.nextInt();
break;}

case 3:{
String dateSetting = """
		     
	DATE SETTING	     

""";
System.out.print(dateSetting);
navigate = input.nextInt();
break;}

case 4:{
String stopwatch = """
		     
	STOPWATCH	     

""";
System.out.print(stopwatch);
navigate = input.nextInt();
break;}

case 5:{
String countdownTimer = """
		     
	COUNTDOWN TIMER	     

""";
System.out.print(countdownTimer);
navigate = input.nextInt();
break;}

case 6:{
String autoUpdate = """
		     
	AUTO UPDATE OF DATE AND TIME	     

""";
System.out.print(autoUpdate);
navigate = input.nextInt();
break;}
}//clock

}
break;}



case 12:{String profiles = """
		     
	PROFILES	     

""";
System.out.print(profiles);
navigate = input.nextInt();
break;}

case 13:{String simServices = """
		     
	SIM SERVICES	     

""";
System.out.print(simServices);
navigate = input.nextInt();
break;}

}

}
}}