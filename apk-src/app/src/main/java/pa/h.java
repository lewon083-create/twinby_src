package pa;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends qa.a {
    public static final Parcelable.Creator<h> CREATOR = new l0(2);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Scope[] f31362p = new Scope[0];

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final ma.d[] f31363q = new ma.d[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f31364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f31365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f31366d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f31367e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public IBinder f31368f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Scope[] f31369g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Bundle f31370h;
    public Account i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ma.d[] f31371j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ma.d[] f31372k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f31373l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f31374m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f31375n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f31376o;

    public h(int i, int i10, int i11, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, ma.d[] dVarArr, ma.d[] dVarArr2, boolean z5, int i12, boolean z10, String str2) {
        Scope[] scopeArr2 = scopeArr == null ? f31362p : scopeArr;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        ma.d[] dVarArr3 = f31363q;
        ma.d[] dVarArr4 = dVarArr == null ? dVarArr3 : dVarArr;
        dVarArr3 = dVarArr2 != null ? dVarArr2 : dVarArr3;
        this.f31364b = i;
        this.f31365c = i10;
        this.f31366d = i11;
        if ("com.google.android.gms".equals(str)) {
            this.f31367e = "com.google.android.gms";
        } else {
            this.f31367e = str;
        }
        if (i < 2) {
            Account account2 = null;
            if (iBinder != null) {
                int i13 = a.f31320c;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                IInterface q0Var = iInterfaceQueryLocalInterface instanceof j ? (j) iInterfaceQueryLocalInterface : new q0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 6);
                long jClearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    try {
                        q0 q0Var2 = (q0) q0Var;
                        Parcel parcelL0 = q0Var2.l0(q0Var2.D0(), 2);
                        Account account3 = (Account) fb.h.a(parcelL0, Account.CREATOR);
                        parcelL0.recycle();
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                        account2 = account3;
                    } catch (RemoteException unused) {
                        Log.w("AccountAccessor", "Remote account accessor probably died");
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                    }
                } catch (Throwable th2) {
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                    throw th2;
                }
            }
            this.i = account2;
        } else {
            this.f31368f = iBinder;
            this.i = account;
        }
        this.f31369g = scopeArr2;
        this.f31370h = bundle2;
        this.f31371j = dVarArr4;
        this.f31372k = dVarArr3;
        this.f31373l = z5;
        this.f31374m = i12;
        this.f31375n = z10;
        this.f31376o = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        l0.a(this, parcel, i);
    }
}
