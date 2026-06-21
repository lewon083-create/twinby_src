package d8;

import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.JsonWriter;
import android.util.Log;
import com.google.android.gms.internal.ads.om1;
import io.sentry.protocol.Message;
import java.io.IOException;
import java.util.IllegalFormatException;
import java.util.Locale;
import q9.l1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class u implements u9.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f15702c;

    public static u b(m3.p pVar) {
        String str;
        pVar.N(2);
        int iZ = pVar.z();
        int i = iZ >> 1;
        int iZ2 = ((pVar.z() >> 3) & 31) | ((iZ & 1) << 5);
        if (i == 4 || i == 5 || i == 7 || i == 8) {
            str = "dvhe";
        } else if (i == 9) {
            str = "dvav";
        } else {
            if (i != 10) {
                return null;
            }
            str = "dav1";
        }
        StringBuilder sbJ = pe.a.j(str);
        sbJ.append(i < 10 ? ".0" : ".");
        sbJ.append(i);
        return new u(l7.o.j(iZ2, iZ2 < 10 ? ".0" : ".", sbJ), 1);
    }

    public static String e(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e3) {
                Log.e("PlayCore", "Unable to format ".concat(String.valueOf(str2)), e3);
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + "]";
            }
        }
        return gf.a.k(str, " : ", str2);
    }

    public ba.a a() {
        if (this.f15702c != null) {
            return new ba.a(this);
        }
        throw new IllegalArgumentException("Product type must be set");
    }

    public void c(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", e(this.f15702c, str, objArr));
        }
    }

    public void d(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            Log.w("PlayCore", e(this.f15702c, str, objArr));
        }
    }

    @Override // u9.e
    public /* synthetic */ void q(JsonWriter jsonWriter) throws IOException {
        Object obj = u9.f.f34380b;
        jsonWriter.name(Message.JsonKeys.PARAMS).beginObject();
        String str = this.f15702c;
        if (str != null) {
            jsonWriter.name("error_description").value(str);
        }
        jsonWriter.endObject();
    }

    public String toString() {
        switch (this.f15701b) {
            case 2:
                return this.f15702c;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ u(String str, int i) {
        this.f15701b = i;
        this.f15702c = str;
    }

    public u(String str) {
        this.f15701b = 4;
        this.f15702c = om1.j("UID: [", Process.myUid(), "]  PID: [", Process.myPid(), "] ").concat(str);
    }

    public u(l1 l1Var) {
        String strI;
        this.f15701b = 2;
        try {
            strI = l1Var.i();
        } catch (RemoteException e3) {
            u9.i.f("", e3);
            strI = null;
        }
        this.f15702c = strI;
    }
}
