package md588ad32461f5ccec3bb6beeb6a470652f;


public class AndroidPullToRefreshControl
	extends android.widget.LinearLayout
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("DevExpress.Mobile.DataGrid.Android.AndroidPullToRefreshControl, DevExpress.Mobile.Grid.Android.v17.1, Version=17.1.2.0, Culture=neutral, PublicKeyToken=null", AndroidPullToRefreshControl.class, __md_methods);
	}


	public AndroidPullToRefreshControl (android.content.Context p0)
	{
		super (p0);
		if (getClass () == AndroidPullToRefreshControl.class)
			mono.android.TypeManager.Activate ("DevExpress.Mobile.DataGrid.Android.AndroidPullToRefreshControl, DevExpress.Mobile.Grid.Android.v17.1, Version=17.1.2.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0 });
	}


	public AndroidPullToRefreshControl (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == AndroidPullToRefreshControl.class)
			mono.android.TypeManager.Activate ("DevExpress.Mobile.DataGrid.Android.AndroidPullToRefreshControl, DevExpress.Mobile.Grid.Android.v17.1, Version=17.1.2.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0, p1 });
	}


	public AndroidPullToRefreshControl (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == AndroidPullToRefreshControl.class)
			mono.android.TypeManager.Activate ("DevExpress.Mobile.DataGrid.Android.AndroidPullToRefreshControl, DevExpress.Mobile.Grid.Android.v17.1, Version=17.1.2.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public AndroidPullToRefreshControl (android.content.Context p0, android.util.AttributeSet p1, int p2, int p3)
	{
		super (p0, p1, p2, p3);
		if (getClass () == AndroidPullToRefreshControl.class)
			mono.android.TypeManager.Activate ("DevExpress.Mobile.DataGrid.Android.AndroidPullToRefreshControl, DevExpress.Mobile.Grid.Android.v17.1, Version=17.1.2.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e", this, new java.lang.Object[] { p0, p1, p2, p3 });
	}

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
