new AlertDialog.Builder(this)
		    .setTitle("Majom vagyok")
		    .setMessage("MAJOM?")
		    .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
		        public void onClick(DialogInterface dialog, int which) { 
		            // continue with delete
		        }
		     })
		    .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
		        public void onClick(DialogInterface dialog, int which) { 
		            // do nothing
		        }
		     })
		    .setIcon(R.drawable.common_signin_btn_icon_dark)
		     .show();
