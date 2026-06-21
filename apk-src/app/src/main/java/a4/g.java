package a4;

import a0.t1;
import a0.x;
import ad.j0;
import android.os.SystemClock;
import com.google.android.gms.internal.ads.c7;
import com.google.android.gms.internal.ads.mb0;
import com.google.android.gms.internal.ads.td0;
import com.google.android.gms.internal.ads.xu1;
import com.google.android.gms.internal.measurement.h5;
import e4.a0;
import e4.z;
import g0.p0;
import j3.d0;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.regex.Matcher;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements mb0, td0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f431d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f432e;

    public /* synthetic */ g(int i) {
        this.f429b = i;
    }

    public static byte[] c(byte b2, DataInputStream dataInputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = {b2, dataInputStream.readByte()};
        byteArrayOutputStream.write(bArr);
        while (true) {
            if (bArr[0] == 13 && bArr[1] == 10) {
                return byteArrayOutputStream.toByteArray();
            }
            bArr[0] = bArr[1];
            byte b10 = dataInputStream.readByte();
            bArr[1] = b10;
            byteArrayOutputStream.write(b10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0141  */
    @Override // com.google.android.gms.internal.ads.mb0, com.google.android.gms.internal.ads.td0
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo0a(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 584
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.g.mo0a(java.lang.Object):void");
    }

    public j0 b(byte[] bArr) throws d0 {
        long j10;
        ArrayList arrayList = (ArrayList) this.f432e;
        h5.h(bArr.length >= 2 && bArr[bArr.length - 2] == 13 && bArr[bArr.length - 1] == 10);
        String str = new String(bArr, 0, bArr.length - 2, z.f16219h);
        arrayList.add(str);
        int i = this.f431d;
        if (i == 1) {
            if (!a0.f16036a.matcher(str).matches() && !a0.f16037b.matcher(str).matches()) {
                return null;
            }
            this.f431d = 2;
            return null;
        }
        if (i != 2) {
            throw new IllegalStateException();
        }
        try {
            Matcher matcher = a0.f16038c.matcher(str);
            if (matcher.find()) {
                String strGroup = matcher.group(1);
                strGroup.getClass();
                j10 = Long.parseLong(strGroup);
            } else {
                j10 = -1;
            }
            if (j10 != -1) {
                this.f430c = j10;
            }
            if (!str.isEmpty()) {
                return null;
            }
            if (this.f430c > 0) {
                this.f431d = 3;
                return null;
            }
            j0 j0VarR = j0.r(arrayList);
            arrayList.clear();
            this.f431d = 1;
            this.f430c = 0L;
            return j0VarR;
        } catch (NumberFormatException e3) {
            throw d0.b(str, e3);
        }
    }

    public /* synthetic */ g(c7 c7Var, long j10, int i) {
        this.f429b = 1;
        this.f432e = c7Var;
        this.f430c = j10;
        this.f431d = i;
    }

    public /* synthetic */ g(xu1 xu1Var, int i, long j10, long j11) {
        this.f429b = 2;
        this.f432e = xu1Var;
        this.f431d = i;
        this.f430c = j10;
    }

    public g(long j10, Exception exc) {
        this.f429b = 6;
        this.f430c = SystemClock.elapsedRealtime() - j10;
        if (exc instanceof p0) {
            this.f431d = 2;
            this.f432e = exc;
            return;
        }
        if (exc instanceof t1) {
            Throwable cause = exc.getCause();
            exc = cause != null ? cause : exc;
            this.f432e = exc;
            if (exc instanceof x) {
                this.f431d = 2;
                return;
            } else if (exc instanceof IllegalArgumentException) {
                this.f431d = 1;
                return;
            } else {
                this.f431d = 0;
                return;
            }
        }
        this.f431d = 0;
        this.f432e = exc;
    }

    public g() {
        this.f429b = 5;
        this.f432e = new ArrayList();
        this.f431d = 1;
    }

    public g(int i, URL url, long j10) {
        this.f429b = 8;
        this.f431d = i;
        this.f432e = url;
        this.f430c = j10;
    }

    public g(int i, long j10) {
        this.f429b = 0;
        this.f431d = i;
        this.f430c = j10;
    }
}
