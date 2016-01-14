package seu.jun.shake;

import seu.jun.menu.SlidingLayout;
import android.view.View;
import android.view.View.OnClickListener;

public  class TouchLayout {
	
	public void onClick_touch(View view,final SlidingLayout slidingLayout) {
		
		view.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (slidingLayout.isLeftLayoutVisible()) {
					slidingLayout.scrollToRightLayout();
				} else {
					slidingLayout.scrollToLeftLayout();
				}
			}
		});
	}

}
