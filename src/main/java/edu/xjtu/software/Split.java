package edu.xjtu.software;


import com.hankcs.hanlp.HanLP;
import com.hankcs.hanlp.seg.common.Term;
import com.hankcs.hanlp.tokenizer.StandardTokenizer;
import org.ansj.splitWord.analysis.ToAnalysis;

import java.util.List;

/**
 * Created by guyingcheng on 17/6/14.
 */
public class Split {
    public static void main(String[] args) {
        //System.out.println(HanLP.segment("你好，欢迎使用HanLP汉语处理包！"));
        String text = "本体用于形式化地保存某一领域的知识,创建本体的过程可以被视为将人类所掌握的知识转换为一种计算机可获取的形 式的过程。显然,有不少可能的知识源需要被形式化。知识源 可能存放在领域专家的大脑中、互联网中、数据库中或者书本及 文档中[1]。本文主要讨论如何将非结构化的中文文档中的领 域知识转化为计算机所能处理的本体。国内外主要的本体构建 方法有 TOVE法、骨架法、IDEF5法、METHONTOLOGY法、KACTUS工程法、七步法等综合性方法[2]。文献[3-5] 分别对这些方法进行了比较研究。通过这些分析比较,可以看 出[6]:1)目前还没有一套完善的工程方法,很大程度上依赖于 具体的项目;2)本体的构建应以具体的项目领域和任务作为起\n" +
                "点 ,以便于进行本体功能的描述和知识的获取,没有专门针对中文文档知识的本体构建的成熟方法,可参考现有软件开发 标准,结合项目和实际任务的需求,探索和完善构建本体的标准 方法论;4)大部分构建过程都需要人工构建,自动化程度不高, 效率低下。";
        List<String> sentenceList = HanLP.extractSummary(text, 3);
        String test01 = "本体用于形式化地保存某一领域的知识";
        List<String> keywordList = HanLP.extractPhrase(test01, 3);
        System.out.println(keywordList);
    }
}
