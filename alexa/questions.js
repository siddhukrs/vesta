


exports.getQuestion  = function(memberId ,callback){
    url= "http://52.91.138.129:8089/questions/"+memberId
    // const questions = [
    //     {
    //         "question": "How many steps have you taken this week", 
    //         "answer": ["200"] , 
    //         "suggestion" : {
    //             "goal": "",
    //             "image" : ""
    //         }
    //     },
    //     {
    //         "question": "How many push ups did you do today?", 
    //         "answer": ["55"]
    //     }
    // ];


    const questions = {
        "scott" :{
            "question": "Guess who has done 100 ab crunches in the past 2 days?", 
            "answer": ["emily" , "Emily"] , 
            "goal" : "<p>emily</p> you are on the right track to reach your goal of 1000 crunches per week"
        },
        "mark" : {
            "question": "How many miles did Steve run in the past 2 days?", 
            "answer": ["1"] , 
            "goal" : "<p>Steve</p>Awesome<p>you achieved your goal for this week</p>"
        },
        "emily" :{
            "question": "How many miles did Mark swim in his last masters class?", 
            "answer": ["2"] ,
            "goal" : "Good to see you raking those miles Mark. <break time='200ms'/> You are getting closer to the magic number of 6 miles per week"
        },
        "steve" :{
            "question": "How many minutes of walking did Scott do yesterday?", 
            "answer": ["60" ] , 
            "goal" : " <p>Great going Scott</p> you are 25% closer to your goal of 240 minutes per week.<break time='200ms'/> And by the way you have missed zero medications this week, kudos on that."
        }
    }

    
    callback(null , questions[memberId]);
}



exports.getGoals = function(callback){
    url= "http://52.91.138.129:8089/goals";
    var results = {
        "goals" : ["Steve is 20% to his goal" , "Mark completed his goal of 200 push ups"]
    }
    
    callback(null , results["goals"])
}