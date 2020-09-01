/* 实现枚举类*/


// 调用枚举values(),ordinal(),valueof()
public class demo_enumColor {
    enum Color
    {
        RED,GREEN,BLUE;
    }
    public static void main(String[] args) {
        Color arr[] = Color.values();

        // 迭代
        for (Color col : arr)
        {
            // 查看索引
            System.out.println(col+"at index"+col.ordinal());
        }

        // valueof() 返回枚举常量
        System.out.println(Color.valueOf("RED"));
    }
}
