package seu.jun.shake;

import com.jun.wheretoeat.R;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.util.Log;
import android.widget.Toast;

public class ShakeDialog {
	private int count = 0;
	private int state=2;
	private String answer;
	private Context context;

	public ShakeDialog(Context context) {
		this.context = context;
	}

	public AlertDialog GetContent() {
		// TODO Auto-generated method stub
		AlertDialog.Builder builder = new AlertDialog.Builder(context);
		builder.setIcon(R.drawable.attention);
		builder.setTitle("对话框内容");
		builder.setMessage(getdata());
		builder.setPositiveButton("按钮一", new OnClickListener() {

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				Toast.makeText(context, "这是消息提示", Toast.LENGTH_SHORT)
						.show();
				state = 2;
				setState(state);
				Log.v("bb",String.valueOf(state));
			}
		});
		builder.setNegativeButton("按钮二", new OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				dialog.cancel();
				state = 2;
				setState(state);
			}
		}).show();
		Log.v("cc",String.valueOf(state));
		return builder.create();
	}

	private String getdata() {
		// TODO Auto-generated method stub
		Resources resources = context.getResources();
		String eatlist[] = resources.getStringArray(R.array.contentlist);
		int listsize = eatlist.length;
		count = (int) (Math.random() * listsize);
		answer = eatlist[count];
		return answer;
	}
	
	public int getState() {
		Log.v("aa",String.valueOf(state));
		return state;
	}
	
	public  void setState(int state) {
		this.state = state;
		getState();
	}
}
