package holygrails
import com.iinterchange.Quest


class BootStrap {

    def init = { servletContext ->

             new Quest(name:"This is quest")
            .addToTasks(name:'Run away for killer rabbit',priority:3)
            .addToTasks(name:'Seek the grils',priority:4)
            .addToTasks(name:'Defeat the Black knight',completed:true)
            .addToTasks(name:'Answer the Bridgekeeper',priority:5)
            .save()

            new Quest(name:"Hi t")
            .addToTasks(name:'Run away for killer rabbit',priority:3)
            .addToTasks(name:'Seek the grils',priority:4)
            .addToTasks(name:'Defeat the Black knight',completed:true)
            .addToTasks(name:'Answer the Bridgekeeper',priority:5)
            .save()
    }
    def destroy = {
    }
}
