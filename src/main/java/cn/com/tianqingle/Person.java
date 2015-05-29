package cn.com.tianqingle;


import com.opensymphony.xwork2.Action;

/**
 * Created by huan on 2015/5/29 0029.
 */
public class Person implements Action {

    Dog dog;
    public void setDog(Dog dog) {
        this.dog = dog;
    }


    @Override
    public String execute() throws Exception {

        dog.ff();
        return SUCCESS;
    }
}
