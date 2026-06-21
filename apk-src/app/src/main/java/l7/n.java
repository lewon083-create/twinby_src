package l7;

import android.content.Context;
import android.util.Log;
import android.view.KeyCharacterMap;
import com.google.android.gms.internal.ads.e80;
import com.google.android.gms.internal.ads.hf;
import com.google.android.gms.internal.ads.td0;
import com.google.android.gms.internal.ads.xu1;
import com.google.android.gms.internal.ads.yu1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements e80, td0, ya.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static n f28050d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f28051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f28052c;

    public /* synthetic */ n(int i, int i10) {
        this.f28051b = i10;
        this.f28052c = i;
    }

    public static synchronized n g() {
        try {
            if (f28050d == null) {
                f28050d = new n(3, 0);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f28050d;
    }

    public static String i(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append("WM-");
        if (length >= 20) {
            sb2.append(str.substring(0, 20));
        } else {
            sb2.append(str);
        }
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.e80
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void mo7a(Object obj) {
        switch (this.f28051b) {
            case 3:
                ((s9.l) obj).E0(this.f28052c);
                break;
            case 7:
                ((yu1) obj).b(this.f28052c);
                break;
            case 8:
                ((yu1) obj).f(this.f28052c);
                break;
            default:
                ((yu1) obj).a(this.f28052c);
                break;
        }
    }

    @Override // ya.b
    public int b(Context context, String str, boolean z5) {
        return 0;
    }

    @Override // ya.b
    public int c(Context context, String str) {
        return this.f28052c;
    }

    public Character d(int i) {
        char c8 = (char) i;
        if ((Integer.MIN_VALUE & i) != 0) {
            int i10 = i & Integer.MAX_VALUE;
            int i11 = this.f28052c;
            if (i11 != 0) {
                this.f28052c = KeyCharacterMap.getDeadChar(i11, i10);
            } else {
                this.f28052c = i10;
            }
        } else {
            int i12 = this.f28052c;
            if (i12 != 0) {
                int deadChar = KeyCharacterMap.getDeadChar(i12, i);
                if (deadChar > 0) {
                    c8 = (char) deadChar;
                }
                this.f28052c = 0;
            }
        }
        return Character.valueOf(c8);
    }

    public void e(String str, String str2, Throwable... thArr) {
        if (this.f28052c <= 3) {
            if (thArr.length >= 1) {
                Log.d(str, str2, thArr[0]);
            } else {
                Log.d(str, str2);
            }
        }
    }

    public void f(String str, String str2, Throwable... thArr) {
        if (this.f28052c <= 6) {
            if (thArr.length >= 1) {
                Log.e(str, str2, thArr[0]);
            } else {
                Log.e(str, str2);
            }
        }
    }

    public void h(String str, String str2, Throwable... thArr) {
        if (this.f28052c <= 4) {
            if (thArr.length >= 1) {
                Log.i(str, str2, thArr[0]);
            } else {
                Log.i(str, str2);
            }
        }
    }

    public void j(String str, String str2, Throwable... thArr) {
        if (this.f28052c <= 5) {
            if (thArr.length >= 1) {
                Log.w(str, str2, thArr[0]);
            } else {
                Log.w(str, str2);
            }
        }
    }

    public int k() {
        int i = this.f28052c;
        if (i == 2) {
            return 10;
        }
        if (i == 5) {
            return 11;
        }
        if (i == 29) {
            return 12;
        }
        if (i == 42) {
            return 16;
        }
        if (i != 22) {
            return i != 23 ? 0 : 15;
        }
        return 1073741824;
    }

    public /* synthetic */ n(xu1 xu1Var, int i) {
        this.f28051b = 8;
        this.f28052c = i;
    }

    public /* synthetic */ n(xu1 xu1Var, int i, long j10) {
        this.f28051b = 7;
        this.f28052c = i;
    }

    public /* synthetic */ n(xu1 xu1Var, int i, hf hfVar, hf hfVar2) {
        this.f28051b = 9;
        this.f28052c = i;
    }

    public /* synthetic */ n(n nVar) {
        this.f28051b = 5;
        this.f28052c = nVar.f28052c;
    }

    public n(int i) {
        this.f28051b = i;
        switch (i) {
            case 11:
                this.f28052c = 3;
                break;
            case 13:
                this.f28052c = 0;
                break;
        }
    }
}
