

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.*; 


public class AssignMapper extends Mapper<LongWritable, Text, Text, IntWritable> {
	Text outKey=new Text();
	IntWritable outValue=new IntWritable(1);
	
	public void map(LongWritable key, Text value, Context context) 
			throws IOException, InterruptedException {
		String[] data=value.toString().split("\t");
		outKey.set(data[1]); // For the second task replace with outKey.set(data[0]); 
			context.write(outKey,outValue);
	
			
		}
	}
