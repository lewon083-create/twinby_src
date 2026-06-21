package jb;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import oa.p;
import q9.o;
import tb.r;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends pa.i {
    public final Context A;
    public final int B;
    public final String C;
    public final int D;
    public final boolean E;

    public a(Context context, Looper looper, o oVar, p pVar, p pVar2, int i) {
        super(context, looper, 4, oVar, pVar, pVar2, 0);
        this.A = context;
        this.B = i;
        this.C = null;
        this.D = 1;
        this.E = true;
    }

    @Override // pa.e, na.c
    public final int b() {
        return 12600000;
    }

    @Override // pa.e
    public final /* synthetic */ IInterface e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wallet.internal.IOwService");
        return iInterfaceQueryLocalInterface instanceof i ? (i) iInterfaceQueryLocalInterface : new i(iBinder);
    }

    @Override // pa.e
    public final ma.d[] h() {
        return r.f33746c;
    }

    @Override // pa.e
    public final String o() {
        return "com.google.android.gms.wallet.internal.IOwService";
    }

    @Override // pa.e
    public final String p() {
        return "com.google.android.gms.wallet.service.BIND";
    }

    public final Bundle x() {
        String packageName = this.A.getPackageName();
        Bundle bundle = new Bundle();
        bundle.putInt("com.google.android.gms.wallet.EXTRA_ENVIRONMENT", this.B);
        bundle.putBoolean("com.google.android.gms.wallet.EXTRA_USING_ANDROID_PAY_BRAND", this.E);
        bundle.putString("androidPackageName", packageName);
        String str = this.C;
        if (!TextUtils.isEmpty(str)) {
            bundle.putParcelable("com.google.android.gms.wallet.EXTRA_BUYER_ACCOUNT", new Account(str, "com.google"));
        }
        bundle.putInt("com.google.android.gms.wallet.EXTRA_THEME", this.D);
        return bundle;
    }
}
