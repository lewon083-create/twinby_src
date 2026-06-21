package fd;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.Preview3AThreadCrashQuirk;
import androidx.camera.camera2.internal.compat.quirk.StillCaptureFlashStopRepeatingQuirk;
import androidx.camera.camera2.internal.compat.quirk.TorchIsClosedAfterImageCapturingQuirk;
import androidx.camera.camera2.internal.compat.quirk.UseTorchAsFlashQuirk;
import androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk;
import com.google.android.gms.internal.ads.y2;
import com.google.android.gms.internal.measurement.h5;
import g0.a1;
import g0.a2;
import g0.q1;
import g0.r0;
import g0.s0;
import g0.u1;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import n3.n;
import n3.o;
import n3.p;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f16748a;

    public static s0 a(s0 s0Var) {
        r0 r0Var = new r0();
        r0Var.f19728c = s0Var.f19747c;
        Iterator it = Collections.unmodifiableList(s0Var.f19745a).iterator();
        while (it.hasNext()) {
            r0Var.d((a1) it.next());
        }
        r0Var.c(s0Var.f19746b);
        q1 q1VarV = q1.v();
        q1VarV.y(s.b.u(CaptureRequest.FLASH_MODE), 0);
        r0Var.c(new s.b(u1.u(q1VarV)));
        return r0Var.e();
    }

    public boolean b(ArrayList arrayList, boolean z5) {
        if (!this.f16748a || !z5) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) ((CaptureRequest) it.next()).get(CaptureRequest.FLASH_MODE);
            if (num != null && num.intValue() == 2) {
                return true;
            }
        }
        return false;
    }

    public void c(boolean z5) {
        if (this.f16748a == z5) {
            return;
        }
        this.f16748a = z5;
    }

    public boolean d(ArrayList arrayList, boolean z5) {
        if (!this.f16748a || !z5) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) ((CaptureRequest) it.next()).get(CaptureRequest.CONTROL_AE_MODE)).intValue();
            if (iIntValue == 2 || iIntValue == 3) {
                return true;
            }
        }
        return false;
    }

    public b(a2 a2Var, int i) {
        switch (i) {
            case 11:
                this.f16748a = a2Var.h(UseTorchAsFlashQuirk.class);
                break;
            default:
                this.f16748a = a2Var.h(Preview3AThreadCrashQuirk.class);
                break;
        }
    }

    public b(int i) {
        switch (i) {
            case 9:
                this.f16748a = ((StillCaptureFlashStopRepeatingQuirk) w.a.f34941a.i(StillCaptureFlashStopRepeatingQuirk.class)) != null;
                break;
            case 10:
                this.f16748a = w.a.f34941a.i(TorchIsClosedAfterImageCapturingQuirk.class) != null;
                break;
            default:
                this.f16748a = n0.a.f28964a.i(SurfaceOrderQuirk.class) != null;
                break;
        }
    }

    public b(n nVar, p pVar) throws o {
        int i = pVar.f29091a;
        ByteBuffer byteBuffer = pVar.f29092b;
        h5.h(i == 6 || i == 3);
        int iMin = Math.min(4, byteBuffer.remaining());
        byte[] bArr = new byte[iMin];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        y2 y2Var = new y2(iMin, bArr);
        nVar.getClass();
        if (y2Var.h()) {
            this.f16748a = false;
            return;
        }
        int i10 = y2Var.i(2);
        if (!y2Var.h()) {
            this.f16748a = true;
            return;
        }
        if (i10 != 3 && i10 != 0) {
            y2Var.h();
        }
        y2Var.s();
        throw new o();
    }
}
