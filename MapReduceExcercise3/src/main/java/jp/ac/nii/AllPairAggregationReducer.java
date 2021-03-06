package jp.ac.nii;

import java.io.IOException;
import java.util.Iterator;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

/**
 * 以下の式の分母（denominator）を計算するジョブのReducerです。
 *  関連度 = 商品Xと商品Yのペアの総数 / 商品Xを含むペアの総数
 */
// TODO: 型パラメータを補完してください
// ヒント： Reducerの入力データのKeyとValueの型は、Mapperの出力KeyとValueの型と一致させます
public class AllPairAggregationReducer extends Reducer<> {

	private static final NullWritable nullWritable = NullWritable.get();

	private Text valueOut = new Text();

	@Override
	public void reduce(Text keyIn, Iterable<IntWritable> values, Context context)
			throws IOException, InterruptedException {
	    // TODO: ワードカウントと同じ要領でvaluesの合計を計算して、keyの商品の出現回数を計算するReducerを作ろう
      
		int sum = 0;
		Iterator<IntWritable> iterator = values.iterator();

		while (iterator.hasNext()) {
			// TODO: keyInの商品が何個出現したかカウントするコードを記載してください
			TODO;
		}

		// TODO: 商品名と出現回数をカンマ区切りで出力するコードを記載してください
		// ヒント：TextオブジェクトのtoStringメソッドで文字列に変換可能
		TODO;

		context.write(nullWritable, valueOut);
	}
}
