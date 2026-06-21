package b8;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import l7.o;
import m3.p;
import m3.z;
import n3.d;
import p1.m;
import p1.q;
import wa.b;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements k5.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f1989d;

    public /* synthetic */ a(int i, int i10, Object obj) {
        this.f1987b = i;
        this.f1988c = i10;
        this.f1989d = obj;
    }

    public static void d(int i, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        StringBuilder sbM = o.m(i, "Field ", ": expected ");
        o.p(i10, i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 5 ? "unknown" : "fixed32" : "length-delimited" : "fixed64" : "varint", " (wire type ", ") but got ", sbM);
        sbM.append(i11 != 0 ? i11 != 1 ? i11 != 2 ? i11 != 5 ? "unknown" : "fixed32" : "length-delimited" : "fixed64" : "varint");
        sbM.append(" (wire type ");
        sbM.append(i11);
        sbM.append(")");
        throw new IOException(sbM.toString());
    }

    @Override // k5.a
    public int a() {
        return this.f1987b;
    }

    @Override // k5.a
    public int b() {
        return this.f1988c;
    }

    @Override // k5.a
    public int c() {
        int i = this.f1987b;
        return i == -1 ? ((p) this.f1989d).D() : i;
    }

    public boolean e() {
        return j() != 0;
    }

    public byte[] f() {
        int iJ = (int) j();
        if (iJ < 0) {
            throw new IOException(o.i(iJ, "Negative length: "));
        }
        int i = this.f1988c;
        int i10 = this.f1987b;
        if (i - i10 < iJ) {
            throw new EOFException("Not enough bytes for length-delimited field");
        }
        byte[] bArr = new byte[iJ];
        System.arraycopy((byte[]) this.f1989d, i10, bArr, 0, iJ);
        this.f1987b += iJ;
        return bArr;
    }

    public a g() {
        return new a(f());
    }

    public String h() {
        return new String(f(), StandardCharsets.UTF_8);
    }

    public int i() {
        if (this.f1987b < this.f1988c) {
            return (int) j();
        }
        return 0;
    }

    public long j() {
        long j10 = 0;
        for (int i = 0; i < 64; i += 7) {
            int i10 = this.f1987b;
            if (i10 >= this.f1988c) {
                throw new EOFException("Truncated varint");
            }
            byte[] bArr = (byte[]) this.f1989d;
            this.f1987b = i10 + 1;
            byte b2 = bArr[i10];
            j10 |= ((long) (b2 & 127)) << i;
            if ((b2 & 128) == 0) {
                return j10;
            }
        }
        throw new IOException("Malformed varint");
    }

    public void k(int i) {
        int i10 = this.f1988c;
        if (i == 0) {
            j();
            return;
        }
        if (i == 1) {
            int i11 = this.f1987b;
            if (i10 - i11 < 8) {
                throw new EOFException("Not enough bytes to skip fixed64");
            }
            this.f1987b = i11 + 8;
            return;
        }
        if (i == 2) {
            int iJ = (int) j();
            int i12 = this.f1987b;
            if (i10 - i12 < iJ) {
                throw new EOFException("Not enough bytes to skip length-delimited");
            }
            this.f1987b = i12 + iJ;
            return;
        }
        if (i != 5) {
            throw new IOException(o.i(i, "Unknown wire type: "));
        }
        int i13 = this.f1987b;
        if (i10 - i13 < 4) {
            throw new EOFException("Not enough bytes to skip fixed32");
        }
        this.f1987b = i13 + 4;
    }

    public synchronized int l() {
        PackageInfo packageInfoD;
        if (this.f1987b == 0) {
            try {
                packageInfoD = b.a((Context) this.f1989d).d(0, "com.google.android.gms");
            } catch (PackageManager.NameNotFoundException e3) {
                Log.w("Metadata", "Failed to find package ".concat(e3.toString()));
                packageInfoD = null;
            }
            if (packageInfoD != null) {
                this.f1987b = packageInfoD.versionCode;
            }
        }
        return this.f1987b;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0050 A[Catch: all -> 0x002e, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0007, B:9:0x0025, B:14:0x0030, B:16:0x0037, B:18:0x0049, B:26:0x006a, B:21:0x0050, B:23:0x0063, B:29:0x006e, B:33:0x007d), top: B:38:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized int m() {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.f1988c     // Catch: java.lang.Throwable -> L2e
            if (r0 == 0) goto L7
            monitor-exit(r5)
            return r0
        L7:
            java.lang.Object r0 = r5.f1989d     // Catch: java.lang.Throwable -> L2e
            android.content.Context r0 = (android.content.Context) r0     // Catch: java.lang.Throwable -> L2e
            android.content.pm.PackageManager r1 = r0.getPackageManager()     // Catch: java.lang.Throwable -> L2e
            ti.b r0 = wa.b.a(r0)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r2 = "com.google.android.c2dm.permission.SEND"
            java.lang.String r3 = "com.google.android.gms"
            android.content.Context r0 = r0.f33798b     // Catch: java.lang.Throwable -> L2e
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Throwable -> L2e
            int r0 = r0.checkPermission(r2, r3)     // Catch: java.lang.Throwable -> L2e
            r2 = -1
            r3 = 0
            if (r0 != r2) goto L30
            java.lang.String r0 = "Metadata"
            java.lang.String r1 = "Google Play services missing or without correct permission."
            android.util.Log.e(r0, r1)     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r5)
            return r3
        L2e:
            r0 = move-exception
            goto L81
        L30:
            boolean r0 = ua.b.h()     // Catch: java.lang.Throwable -> L2e
            r2 = 1
            if (r0 != 0) goto L50
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> L2e
            java.lang.String r4 = "com.google.android.c2dm.intent.REGISTER"
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r4 = "com.google.android.gms"
            r0.setPackage(r4)     // Catch: java.lang.Throwable -> L2e
            java.util.List r0 = r1.queryIntentServices(r0, r3)     // Catch: java.lang.Throwable -> L2e
            if (r0 == 0) goto L50
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L2e
            if (r0 != 0) goto L50
            goto L6a
        L50:
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> L2e
            java.lang.String r4 = "com.google.iid.TOKEN_REQUEST"
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r4 = "com.google.android.gms"
            r0.setPackage(r4)     // Catch: java.lang.Throwable -> L2e
            java.util.List r0 = r1.queryBroadcastReceivers(r0, r3)     // Catch: java.lang.Throwable -> L2e
            r1 = 2
            if (r0 == 0) goto L6e
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L2e
            if (r0 != 0) goto L6e
            r2 = r1
        L6a:
            r5.f1988c = r2     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r5)
            return r2
        L6e:
            java.lang.String r0 = "Metadata"
            java.lang.String r3 = "Failed to resolve IID implementation package, falling back"
            android.util.Log.w(r0, r3)     // Catch: java.lang.Throwable -> L2e
            boolean r0 = ua.b.h()     // Catch: java.lang.Throwable -> L2e
            if (r2 == r0) goto L7c
            goto L7d
        L7c:
            r2 = r1
        L7d:
            r5.f1988c = r2     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r5)
            return r2
        L81:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L2e
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.a.m():int");
    }

    public a(Context context) {
        this.f1988c = 0;
        this.f1989d = context;
    }

    public a(byte[] bArr) {
        int length = bArr.length;
        this.f1989d = bArr;
        this.f1987b = 0;
        this.f1988c = length;
    }

    public a(Context context, XmlResourceParser xmlResourceParser) {
        this.f1989d = new ArrayList();
        this.f1988c = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), q.f30924h);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.f1987b = typedArrayObtainStyledAttributes.getResourceId(index, this.f1987b);
            } else if (index == 1) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f1988c);
                this.f1988c = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new m().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public a() {
        this.f1989d = new a[256];
        this.f1987b = 0;
        this.f1988c = 0;
    }

    public a(int i, int i10) {
        this.f1989d = null;
        this.f1987b = i;
        int i11 = i10 & 7;
        this.f1988c = i11 == 0 ? 8 : i11;
    }

    public a(d dVar, j3.o oVar) {
        p pVar = dVar.f29043d;
        this.f1989d = pVar;
        pVar.M(12);
        int iD = pVar.D();
        if ("audio/raw".equals(oVar.f26335n)) {
            int iS = z.s(oVar.H) * oVar.F;
            if (iD % iS != 0) {
                m3.b.s("BoxParsers", "Audio sample size mismatch. stsd sample size: " + iS + ", stsz sample size: " + iD);
                iD = iS;
            }
        }
        this.f1987b = iD == 0 ? -1 : iD;
        this.f1988c = pVar.D();
    }
}
