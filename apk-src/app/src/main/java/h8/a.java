package h8;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import e8.e;
import hi.g;
import ii.u;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import t.z;
import t1.b;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static a f20463e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Activity f20464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e f20465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e f20466d;

    public static int a(Context context) {
        Iterator it = c(context).iterator();
        while (it.hasNext()) {
            if (b.a(context, (String) it.next()) == 0) {
                if (Build.VERSION.SDK_INT < 29) {
                    return 4;
                }
                return (ya.e.n(context, "android.permission.ACCESS_BACKGROUND_LOCATION") && b.a(context, "android.permission.ACCESS_BACKGROUND_LOCATION") == 0) ? 4 : 3;
            }
        }
        return 1;
    }

    public static ArrayList c(Context context) throws f8.b {
        boolean zN = ya.e.n(context, "android.permission.ACCESS_FINE_LOCATION");
        boolean zN2 = ya.e.n(context, "android.permission.ACCESS_COARSE_LOCATION");
        if (!zN && !zN2) {
            throw new f8.b();
        }
        ArrayList arrayList = new ArrayList();
        if (zN) {
            arrayList.add("android.permission.ACCESS_FINE_LOCATION");
        }
        if (zN2) {
            arrayList.add("android.permission.ACCESS_COARSE_LOCATION");
        }
        return arrayList;
    }

    @Override // ii.u
    public final boolean b(int i, String[] strArr, int[] iArr) {
        int iIndexOf;
        int i10 = 0;
        if (i == 109) {
            Activity activity = this.f20464b;
            if (activity == null) {
                Log.e("Geolocator", "Trying to process permission result without an valid Activity instance");
                e eVar = this.f20465c;
                if (eVar != null) {
                    eVar.onError(1);
                    return false;
                }
            } else {
                int i11 = 4;
                try {
                    ArrayList<String> arrayListC = c(activity);
                    if (iArr.length == 0) {
                        Log.i("Geolocator", "The grantResults array is empty. This can happen when the user cancels the permission request");
                        return false;
                    }
                    byte b2 = -1;
                    boolean z5 = false;
                    boolean z10 = false;
                    for (String str : arrayListC) {
                        int iIndexOf2 = Arrays.asList(strArr).indexOf(str);
                        if (iIndexOf2 >= 0) {
                            z5 = true;
                        }
                        if (iArr[iIndexOf2] == 0) {
                            b2 = 0;
                        }
                        if (b.f(this.f20464b, str)) {
                            z10 = true;
                        }
                    }
                    if (!z5) {
                        Log.w("Geolocator", "Location permissions not part of permissions send to onRequestPermissionsResult method.");
                        return false;
                    }
                    if (b2 != 0) {
                        i11 = !z10 ? 2 : 1;
                    } else if (Build.VERSION.SDK_INT >= 29 && ((iIndexOf = Arrays.asList(strArr).indexOf("android.permission.ACCESS_BACKGROUND_LOCATION")) < 0 || iArr[iIndexOf] != 0)) {
                        i11 = 3;
                    }
                    e eVar2 = this.f20466d;
                    if (eVar2 != null) {
                        g gVar = eVar2.f16294c;
                        int iM = z.m(i11);
                        if (iM != 0) {
                            if (iM == 1) {
                                i10 = 1;
                            } else if (iM == 2) {
                                i10 = 2;
                            } else {
                                if (iM != 3) {
                                    throw new IndexOutOfBoundsException();
                                }
                                i10 = 3;
                            }
                        }
                        gVar.success(Integer.valueOf(i10));
                    }
                    return true;
                } catch (f8.b unused) {
                    e eVar3 = this.f20465c;
                    if (eVar3 != null) {
                        eVar3.onError(4);
                    }
                }
            }
        }
        return false;
    }

    public final void d(Activity activity, e eVar, e eVar2) {
        if (activity == null) {
            eVar2.onError(1);
            return;
        }
        int i = Build.VERSION.SDK_INT;
        ArrayList arrayListC = c(activity);
        if (i >= 29 && ya.e.n(activity, "android.permission.ACCESS_BACKGROUND_LOCATION") && a(activity) == 3) {
            arrayListC.add("android.permission.ACCESS_BACKGROUND_LOCATION");
        }
        this.f20465c = eVar2;
        this.f20466d = eVar;
        this.f20464b = activity;
        b.e(activity, (String[]) arrayListC.toArray(new String[0]), 109);
    }
}
