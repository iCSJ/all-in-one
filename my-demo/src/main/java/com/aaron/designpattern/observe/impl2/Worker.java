/**
 *
 */
package com.aaron.designpattern.observe.impl2;

/**
 * @author Aaron
 */
public class Worker extends Subjects implements Observer
{

    int age = 20;


    /* (non-Javadoc)
     * @see com.huawei.Observer#update(java.lang.String)
     */
    @Override
    public void update(int newAge)
    {
        System.out.println("同步前的年龄为：" + age);
        age = newAge;
        System.out.println("同步后的年龄为：" + age);
        this.notifyObsever(this, newAge);
    }


    @Override
    void change(int newAge)
    {
        age = newAge;
    }

}
