package ca;

import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.camera2.CameraDevice;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.datastore.preferences.protobuf.k;
import com.google.android.gms.internal.ads.al;
import com.google.android.gms.internal.ads.cf;
import com.google.android.gms.internal.ads.fr;
import com.google.android.gms.internal.ads.gr;
import com.google.android.gms.internal.ads.hx;
import com.google.android.gms.internal.ads.ix;
import com.google.android.gms.internal.ads.jx;
import com.google.android.gms.internal.ads.kx;
import com.google.android.gms.internal.ads.l81;
import com.google.android.gms.internal.ads.lx;
import com.google.android.gms.internal.ads.ut;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.AEADBadTagException;
import k9.v;
import l7.o;
import ma.j;
import pa.c0;
import q9.l;
import q9.r;
import q9.s;
import q9.s0;
import t9.e0;
import u.m;
import u9.i;
import xa.c;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2252a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f2254c;

    public a(ut utVar, e0 e0Var) {
        this.f2254c = utVar;
        this.f2253b = e0Var;
    }

    public abstract Object a(IBinder iBinder);

    public Object b(Context context) throws c {
        Context contextCreatePackageContext;
        if (this.f2254c == null) {
            c0.i(context);
            int i = j.f28781e;
            try {
                contextCreatePackageContext = context.createPackageContext("com.google.android.gms", 3);
            } catch (PackageManager.NameNotFoundException unused) {
                contextCreatePackageContext = null;
            }
            if (contextCreatePackageContext == null) {
                throw new c("Could not get remote context.");
            }
            try {
                this.f2254c = a((IBinder) contextCreatePackageContext.getClassLoader().loadClass((String) this.f2253b).newInstance());
            } catch (ClassNotFoundException e3) {
                throw new c("Could not load creator class.", e3);
            } catch (IllegalAccessException e7) {
                throw new c("Could not access creator.", e7);
            } catch (InstantiationException e10) {
                throw new c("Could not instantiate creator.", e10);
            }
        }
        return this.f2254c;
    }

    public abstract k c(int i, byte[] bArr);

    public byte[] d(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() < 16) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        int iPosition = byteBuffer.position();
        byte[] bArr3 = new byte[16];
        byteBuffer.position(byteBuffer.limit() - 16);
        byteBuffer.get(bArr3);
        byteBuffer.position(iPosition);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        try {
            byte[] bArr4 = new byte[32];
            ((k) this.f2254c).C(0, bArr).get(bArr4);
            int length = bArr2.length;
            int i = length & 15;
            int i10 = i == 0 ? length : (length + 16) - i;
            int iRemaining = byteBuffer.remaining();
            int i11 = iRemaining % 16;
            int i12 = (i11 == 0 ? iRemaining : (iRemaining + 16) - i11) + i10;
            ByteBuffer byteBufferOrder = ByteBuffer.allocate(i12 + 16).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.put(bArr2);
            byteBufferOrder.position(i10);
            byteBufferOrder.put(byteBuffer);
            byteBufferOrder.position(i12);
            byteBufferOrder.putLong(length);
            byteBufferOrder.putLong(iRemaining);
            if (!MessageDigest.isEqual(ix.r(bArr4, byteBufferOrder.array()), bArr3)) {
                throw new GeneralSecurityException("invalid MAC");
            }
            byteBuffer.position(iPosition);
            k kVar = (k) this.f2253b;
            kVar.getClass();
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
            if (bArr.length != kVar.B()) {
                int iB = kVar.B();
                throw new GeneralSecurityException(o.j(iB, "The nonce length (in bytes) must be ", new StringBuilder(String.valueOf(iB).length() + 36)));
            }
            int iRemaining2 = byteBuffer.remaining();
            int i13 = iRemaining2 / 64;
            for (int i14 = 0; i14 < i13 + 1; i14++) {
                ByteBuffer byteBufferC = kVar.C(kVar.f1432a + i14, bArr);
                if (i14 == i13) {
                    ix.O(byteBufferAllocate, byteBuffer, byteBufferC, iRemaining2 % 64);
                } else {
                    ix.O(byteBufferAllocate, byteBuffer, byteBufferC, 64);
                }
            }
            return byteBufferAllocate.array();
        } catch (GeneralSecurityException e3) {
            throw new AEADBadTagException(e3.toString());
        }
    }

    public void e(lx lxVar, kx kxVar) {
        ut utVar = new ut(this, lxVar, kxVar, 8);
        jx jxVar = (jx) this.f2253b;
        jxVar.a(new l81(0, jxVar, utVar), hx.f6285g);
    }

    public void f() {
        switch (this.f2252a) {
            case 0:
                try {
                    ((s0) this.f2253b).R(((k9.a) this.f2254c).f27254b);
                } catch (RemoteException e3) {
                    i.k("#007 Could not call remote method.", e3);
                    return;
                }
                break;
            default:
                ((jx) this.f2253b).d(new Exception());
                break;
        }
    }

    public void g(String str, Throwable th2) {
        ((jx) this.f2253b).d(th2);
        if (((Boolean) s.f31967e.f31970c.a(al.B8)).booleanValue()) {
            p9.k.C.f31302h.e(str, th2);
        }
    }

    public a(String str) {
        this.f2253b = str;
    }

    public a() {
        jx jxVar = new jx();
        this.f2253b = jxVar;
        this.f2254c = new AtomicInteger(0);
        cf cfVar = new cf(13, this);
        jxVar.a(new l81(0, jxVar, cfVar), hx.f6285g);
    }

    public a(Context context, k9.a aVar) {
        if (v.f27292b == null) {
            synchronized (v.class) {
                try {
                    if (v.f27292b == null) {
                        q9.o oVar = r.f31959g.f31961b;
                        fr frVar = new fr();
                        oVar.getClass();
                        v.f27292b = (s0) new l(oVar, context, frVar).d(context, false);
                    }
                } finally {
                }
            }
        }
        this.f2253b = v.f27292b;
        context.getApplicationContext();
        this.f2254c = aVar;
    }

    public a(byte[] bArr) throws GeneralSecurityException {
        if (gr.x(1)) {
            this.f2253b = c(1, bArr);
            this.f2254c = c(0, bArr);
            return;
        }
        throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
    }

    public a(CameraDevice cameraDevice, m mVar) {
        cameraDevice.getClass();
        this.f2253b = cameraDevice;
        this.f2254c = mVar;
    }
}
