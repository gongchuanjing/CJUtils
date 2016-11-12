package tk.chuanjing.cjutils;

import android.app.Application;
import android.content.Context;

/**
 * @author ChuanJing
 * @date 2016年7月27日 上午10:13:36
 */
public class MyApplication extends Application {

	private static Application instance = null;
	
	@Override
	public void onCreate() {
		super.onCreate();
		
		instance = this;
		
		// 将字体文件保存在assets/fonts/目录下
//		TypefaceCollection typeface = new TypefaceCollection.Builder()
//	            .set(Typeface.NORMAL, Typeface.createFromAsset(getAssets(), "fonts/zhiti.ttf"))
//	            .create();
//	    TypefaceHelper.init(typeface);
	}
	
	/**
	 * 获取上下文对象
	 * @return
	 */
	public static Context getInstance() {
		return instance;
	}
}
