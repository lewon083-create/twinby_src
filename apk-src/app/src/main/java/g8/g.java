package g8;

import a0.a0;
import a0.a2;
import a0.k1;
import a0.q2;
import android.media.MediaCodec;
import android.os.Parcel;
import android.os.Trace;
import android.util.Base64;
import com.google.android.gms.internal.measurement.j4;
import com.google.android.gms.internal.play_billing.k5;
import e4.i0;
import e4.j0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements f3.b, b4.l, oa.m, v8.e, e1.n, e4.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static g f20031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static g f20032d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20033b;

    public /* synthetic */ g(int i) {
        this.f20033b = i;
    }

    public static MediaCodec e(q9.o oVar) throws IOException {
        String str = ((b4.p) oVar.f31946a).f1907a;
        Trace.beginSection("createCodec:" + str);
        MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
        Trace.endSection();
        return mediaCodecCreateByCodecName;
    }

    public static c0.d i(q2 q2Var) {
        Intrinsics.checkNotNullParameter(q2Var, "<this>");
        return q2Var instanceof a2 ? c0.d.f2181d : q2Var instanceof k1 ? c0.d.f2182e : l0.f.z(q2Var) ? c0.d.f2183f : q2Var instanceof u0.d ? c0.d.f2184g : c0.d.f2185h;
    }

    @Override // e4.c
    public e4.d a(int i) throws IOException {
        j0 j0Var = new j0();
        j0 j0Var2 = new j0();
        try {
            j0Var.f16136b.open(a0.e.g(0));
            int i10 = j0Var.i();
            boolean z5 = i10 % 2 == 0;
            j0Var2.f16136b.open(a0.e.g(z5 ? i10 + 1 : i10 - 1));
            if (z5) {
                j0Var.f16137c = j0Var2;
                return j0Var;
            }
            j0Var2.f16137c = j0Var;
            return j0Var2;
        } catch (IOException e3) {
            j4.g(j0Var);
            j4.g(j0Var2);
            throw e3;
        }
    }

    @Override // oa.m
    public void accept(Object obj, Object obj2) {
        bb.c cVar = (bb.c) ((bb.b) obj).n();
        bb.g gVar = new bb.g((sb.g) obj2);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.appset.internal.IAppSetService");
        int i = bb.a.f2014a;
        parcelObtain.writeInt(1);
        j0.g.m0(parcelObtain, j0.g.i0(parcelObtain, 20293));
        parcelObtain.writeStrongBinder(gVar);
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            cVar.f2015b.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain.recycle();
            parcelObtain2.recycle();
        }
    }

    @Override // v8.e
    public Object apply(Object obj) {
        return ((k5) obj).b();
    }

    @Override // e4.c
    public e4.c b() {
        return new i0();
    }

    public String h(List list) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(list);
            objectOutputStream.flush();
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        } catch (IOException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    @Override // b4.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b4.m j(q9.o r6) throws java.lang.Throwable {
        /*
            r5 = this;
            r0 = 0
            android.media.MediaCodec r0 = e(r6)     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            java.lang.String r1 = "configureCodec"
            android.os.Trace.beginSection(r1)     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            java.lang.Object r1 = r6.f31949d     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            android.view.Surface r1 = (android.view.Surface) r1     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            if (r1 != 0) goto L25
            java.lang.Object r2 = r6.f31946a     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            b4.p r2 = (b4.p) r2     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            boolean r2 = r2.f1914h     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            if (r2 == 0) goto L25
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            r3 = 35
            if (r2 < r3) goto L25
            r2 = 8
            goto L26
        L21:
            r6 = move-exception
            goto L49
        L23:
            r6 = move-exception
            goto L49
        L25:
            r2 = 0
        L26:
            java.lang.Object r3 = r6.f31947b     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            android.media.MediaFormat r3 = (android.media.MediaFormat) r3     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            java.lang.Object r4 = r6.f31950e     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            android.media.MediaCrypto r4 = (android.media.MediaCrypto) r4     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            r0.configure(r3, r1, r4, r2)     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            android.os.Trace.endSection()     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            java.lang.String r1 = "startCodec"
            android.os.Trace.beginSection(r1)     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            r0.start()     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            android.os.Trace.endSection()     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            a1.e r1 = new a1.e     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            java.lang.Object r6 = r6.f31951f     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            bb.e r6 = (bb.e) r6     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            r1.<init>(r0, r6)     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            return r1
        L49:
            if (r0 == 0) goto L4e
            r0.release()
        L4e:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: g8.g.j(q9.o):b4.m");
    }

    public String toString() {
        switch (this.f20033b) {
            case 1:
                return "Metadata{mIsReversedHorizontal=false, mIsReversedVertical=false, mLocation=null}";
            default:
                return super.toString();
        }
    }

    @Override // e1.n
    public void g() {
    }

    @Override // e1.n
    public void c(e1.h hVar) {
    }

    @Override // e1.n
    public void d(e1.i iVar) {
    }

    @Override // e1.n
    public void f(a0 a0Var) {
    }
}
