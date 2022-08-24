package cn.ofpp;

import cn.hutool.core.util.StrUtil;
import cn.ofpp.core.Wx;

/**
 * 引导配置
 *
 * @author DokiYolo
 * Date 2022-08-22
 */
public class Bootstrap {

    /**
     * 公众号AppID
     */
    public static final String APP_ID = "wxfadb3bbc10a810fc";

    /**
     * 公众号秘钥
     */
    public static final String SECRET = "4a85528826e4728465958eec668d74fc";

    /**
     * 全局模板ID  也可针对单个Friend指定模板
     */
//    public static final String TEMPLATE_ID = "4FKnKQlQMSDvfo5j-VFT3n4nL1L3nwsME91iknJoibU";
    public static final String TEMPLATE_ID = "TZqOtbrl4wsqCDc6Q3hFoiPvW4qwFDoqiyexFuYZac8";

    /**
     * 初始化
     */
    public static void init() {
        if (StrUtil.hasEmpty(APP_ID, SECRET, TEMPLATE_ID)) {
            throw new IllegalArgumentException("请检查配置");
        }
        Wx.init();
    }

}
