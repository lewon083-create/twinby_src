package nc;

import a0.l1;
import a0.r1;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Size;
import androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk;
import androidx.lifecycle.w0;
import androidx.lifecycle.y0;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import com.google.android.gms.internal.ads.gb;
import com.google.android.gms.internal.measurement.h5;
import com.google.android.gms.internal.measurement.j4;
import com.twinby.R;
import e1.g0;
import fh.zf;
import g0.h2;
import g0.s0;
import g0.v;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class e implements f3.b, y0, b6.a, c0.b, g0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static e f29207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static e f29208c;

    public w0 a(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        return j4.m(modelClass);
    }

    @Override // androidx.lifecycle.y0
    public w0 b(kotlin.jvm.internal.i modelClass, f3.d extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        return e(h5.t(modelClass), extras);
    }

    @Override // b6.a
    public CharSequence c(Preference preference) {
        EditTextPreference editTextPreference = (EditTextPreference) preference;
        if (TextUtils.isEmpty(null)) {
            return editTextPreference.f1647b.getString(R.string.not_set);
        }
        return null;
    }

    @Override // c0.b
    public boolean d(h2 sessionConfig) {
        Intrinsics.checkNotNullParameter(sessionConfig, "sessionConfig");
        return false;
    }

    public w0 e(Class modelClass, f3.d extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        return a(modelClass);
    }

    public Object f(Object obj) throws l1 {
        i0.g gVar;
        f0.d dVar = (f0.d) obj;
        r1 r1Var = dVar.f16492b;
        f0.o oVar = dVar.f16491a;
        if (com.google.android.gms.internal.auth.m.n(r1Var.getFormat())) {
            try {
                gb gbVar = i0.g.f20768b;
                ByteBuffer byteBufferE = r1Var.f()[0].e();
                byteBufferE.rewind();
                byte[] bArr = new byte[byteBufferE.capacity()];
                byteBufferE.get(bArr);
                gVar = new i0.g(new x2.g(new ByteArrayInputStream(bArr)));
                r1Var.f()[0].e().rewind();
            } catch (IOException e3) {
                throw new l1("Failed to extract EXIF data.", e3, 1);
            }
        } else {
            gVar = null;
        }
        if (((ImageCaptureRotationOptionQuirk) n0.a.f28964a.i(ImageCaptureRotationOptionQuirk.class)) != null) {
            g0.g gVar2 = s0.i;
        } else if (com.google.android.gms.internal.auth.m.n(r1Var.getFormat())) {
            f2.g.g(gVar, "JPEG image must have exif.");
            Size size = new Size(r1Var.getWidth(), r1Var.getHeight());
            int iB = oVar.f16533e - gVar.b();
            Size size2 = i0.q.d(i0.q.k(iB)) ? new Size(size.getHeight(), size.getWidth()) : size;
            Matrix matrixA = i0.q.a(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), new RectF(0.0f, 0.0f, size2.getWidth(), size2.getHeight()), iB, false);
            RectF rectF = new RectF(oVar.f16532d);
            matrixA.mapRect(rectF);
            rectF.sort();
            Size size3 = size2;
            Rect rect = new Rect();
            rectF.round(rect);
            int iB2 = gVar.b();
            Matrix matrix = new Matrix(oVar.f16535g);
            matrix.postConcat(matrixA);
            v zfVar = r1Var.x() instanceof l0.c ? ((l0.c) r1Var.x()).f27718a : new zf();
            r1Var.getFormat();
            return new q0.b(r1Var, gVar, r1Var.getFormat(), size3, rect, iB2, matrix, zfVar);
        }
        i0.g gVar3 = gVar;
        Rect rect2 = oVar.f16532d;
        int i = oVar.f16533e;
        Matrix matrix2 = oVar.f16535g;
        v zfVar2 = r1Var.x() instanceof l0.c ? ((l0.c) r1Var.x()).f27718a : new zf();
        Size size4 = new Size(r1Var.getWidth(), r1Var.getHeight());
        if (com.google.android.gms.internal.auth.m.n(r1Var.getFormat())) {
            f2.g.g(gVar3, "JPEG image must have Exif.");
        }
        return new q0.b(r1Var, gVar3, r1Var.getFormat(), size4, rect2, i, matrix2, zfVar2);
    }

    public String g(List list) throws IOException {
        Intrinsics.checkNotNullParameter(list, "list");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(list);
        objectOutputStream.flush();
        String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(...)");
        return strEncodeToString;
    }

    @Override // e1.g0
    public long i() {
        return TimeUnit.NANOSECONDS.toMicros(System.nanoTime());
    }

    @Override // e1.g0
    public long n() {
        return TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos());
    }
}
