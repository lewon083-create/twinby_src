package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class na1 implements yz1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f8259c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f8260d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f8261e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f8262f;

    public na1(int i) {
        this.f8258b = i;
        switch (i) {
            case 1:
                this.f8259c = new HashMap();
                this.f8260d = new HashMap();
                this.f8261e = new HashMap();
                this.f8262f = new HashMap();
                break;
            case 2:
                this.f8259c = null;
                this.f8260d = null;
                this.f8261e = null;
                this.f8262f = qe1.f9473e;
                break;
            case 3:
                this.f8259c = null;
                this.f8260d = null;
                this.f8261e = null;
                this.f8262f = ja1.f6800n;
                break;
            default:
                this.f8259c = null;
                this.f8260d = null;
                this.f8261e = null;
                this.f8262f = h91.i;
                break;
        }
    }

    public void a(int i) throws InvalidAlgorithmParameterException {
        switch (this.f8258b) {
            case 0:
                if (i != 16 && i != 24 && i != 32) {
                    throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
                }
                this.f8259c = Integer.valueOf(i);
                return;
            default:
                this.f8259c = Integer.valueOf(i);
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0064  */
    @Override // com.google.android.gms.internal.ads.yz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.gms.internal.ads.r51 b(int r17, com.google.android.gms.internal.ads.pi r18, int[] r19) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.na1.b(int, com.google.android.gms.internal.ads.pi, int[]):com.google.android.gms.internal.ads.r51");
    }

    public void c(tc1 tc1Var) throws GeneralSecurityException {
        ee1 ee1Var = new ee1(tc1Var.f10590a, yd1.class);
        HashMap map = (HashMap) this.f8259c;
        if (!map.containsKey(ee1Var)) {
            map.put(ee1Var, tc1Var);
            return;
        }
        tc1 tc1Var2 = (tc1) map.get(ee1Var);
        if (!tc1Var2.equals(tc1Var) || !tc1Var.equals(tc1Var2)) {
            throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(ee1Var.toString()));
        }
    }

    public void d() {
        this.f8260d = 12;
    }

    public void e(int i) {
        this.f8260d = Integer.valueOf(i);
    }

    public void f(rc1 rc1Var) throws GeneralSecurityException {
        rc1Var.getClass();
        de1 de1Var = new de1(yd1.class, rc1Var.f9818a);
        HashMap map = (HashMap) this.f8260d;
        if (!map.containsKey(de1Var)) {
            map.put(de1Var, rc1Var);
            return;
        }
        rc1 rc1Var2 = (rc1) map.get(de1Var);
        if (!rc1Var2.equals(rc1Var) || !rc1Var.equals(rc1Var2)) {
            throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(de1Var.toString()));
        }
    }

    public void g() {
        this.f8261e = 16;
    }

    public void h(nd1 nd1Var) throws GeneralSecurityException {
        ee1 ee1Var = new ee1(nd1Var.f8276a, zd1.class);
        HashMap map = (HashMap) this.f8261e;
        if (!map.containsKey(ee1Var)) {
            map.put(ee1Var, nd1Var);
            return;
        }
        nd1 nd1Var2 = (nd1) map.get(ee1Var);
        if (!nd1Var2.equals(nd1Var) || !nd1Var.equals(nd1Var2)) {
            throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(ee1Var.toString()));
        }
    }

    public void i(ld1 ld1Var) throws GeneralSecurityException {
        ld1Var.getClass();
        de1 de1Var = new de1(zd1.class, ld1Var.f7490a);
        HashMap map = (HashMap) this.f8262f;
        if (!map.containsKey(de1Var)) {
            map.put(de1Var, ld1Var);
            return;
        }
        ld1 ld1Var2 = (ld1) map.get(de1Var);
        if (!ld1Var2.equals(ld1Var) || !ld1Var.equals(ld1Var2)) {
            throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(de1Var.toString()));
        }
    }

    public oa1 j() throws GeneralSecurityException {
        Integer num = (Integer) this.f8259c;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (((Integer) this.f8260d) == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if (((Integer) this.f8261e) == null) {
            throw new GeneralSecurityException("Tag size is not set");
        }
        int iIntValue = num.intValue();
        ((Integer) this.f8260d).getClass();
        ((Integer) this.f8261e).getClass();
        return new oa1(iIntValue, (h91) this.f8262f);
    }

    public re1 k() throws GeneralSecurityException {
        Integer num = (Integer) this.f8259c;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (((Integer) this.f8260d) == null) {
            throw new GeneralSecurityException("tag size is not set");
        }
        if (((pe1) this.f8261e) == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (num.intValue() < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", (Integer) this.f8259c));
        }
        Integer num2 = (Integer) this.f8260d;
        int iIntValue = num2.intValue();
        pe1 pe1Var = (pe1) this.f8261e;
        if (iIntValue < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", num2));
        }
        if (pe1Var == pe1.f9032b) {
            if (iIntValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num2));
            }
        } else if (pe1Var == pe1.f9033c) {
            if (iIntValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num2));
            }
        } else if (pe1Var == pe1.f9034d) {
            if (iIntValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num2));
            }
        } else if (pe1Var == pe1.f9035e) {
            if (iIntValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num2));
            }
        } else {
            if (pe1Var != pe1.f9036f) {
                throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
            }
            if (iIntValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num2));
            }
        }
        return new re1(((Integer) this.f8259c).intValue(), ((Integer) this.f8260d).intValue(), (qe1) this.f8262f, (pe1) this.f8261e);
    }

    public hj1 l() {
        ea1 ea1Var = ea1.f4906p;
        fa1 fa1Var = (fa1) this.f8259c;
        if (fa1Var == null) {
            throw new GeneralSecurityException("signature encoding is not set");
        }
        gj1 gj1Var = (gj1) this.f8260d;
        if (gj1Var == null) {
            throw new GeneralSecurityException("EC curve type is not set");
        }
        ea1 ea1Var2 = (ea1) this.f8261e;
        if (ea1Var2 == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        ja1 ja1Var = (ja1) this.f8262f;
        if (gj1Var == gj1.f5829c && ea1Var2 != ea1.f4904n) {
            throw new GeneralSecurityException("NIST_P256 requires SHA256");
        }
        if (gj1Var == gj1.f5830d && ea1Var2 != ea1.f4905o && ea1Var2 != ea1Var) {
            throw new GeneralSecurityException("NIST_P384 requires SHA384 or SHA512");
        }
        if (gj1Var != gj1.f5831e || ea1Var2 == ea1Var) {
            return new hj1(fa1Var, gj1Var, ea1Var2, ja1Var);
        }
        throw new GeneralSecurityException("NIST_P521 requires SHA512");
    }

    public na1(mz1 mz1Var, boolean[] zArr) {
        this.f8258b = 5;
        this.f8259c = mz1Var;
        this.f8260d = zArr;
        int i = mz1Var.f8055a;
        this.f8261e = new boolean[i];
        this.f8262f = new boolean[i];
    }

    public /* synthetic */ na1(uz1 uz1Var, String str, int[] iArr, Point point) {
        this.f8258b = 6;
        this.f8259c = uz1Var;
        this.f8260d = str;
        this.f8261e = iArr;
        this.f8262f = point;
    }

    public /* synthetic */ na1(AudioTrack audioTrack, xo0 xo0Var) {
        this.f8258b = 4;
        this.f8259c = audioTrack;
        this.f8262f = xo0Var;
        Handler handlerN = cq0.n();
        this.f8260d = handlerN;
        AudioRouting.OnRoutingChangedListener onRoutingChangedListener = new AudioRouting.OnRoutingChangedListener() { // from class: com.google.android.gms.internal.ads.aw1
            @Override // android.media.AudioRouting.OnRoutingChangedListener
            public final /* synthetic */ void onRoutingChanged(AudioRouting audioRouting) {
                na1 na1Var = this.f3445a;
                if (((aw1) na1Var.f8261e) == null) {
                    return;
                }
                c80.f().execute(new th0(26, na1Var, audioRouting));
            }
        };
        this.f8261e = onRoutingChangedListener;
        audioTrack.addOnRoutingChangedListener(onRoutingChangedListener, handlerN);
    }

    public na1(fe1 fe1Var) {
        this.f8258b = 1;
        this.f8259c = new HashMap(fe1Var.f5330a);
        this.f8260d = new HashMap(fe1Var.f5331b);
        this.f8261e = new HashMap(fe1Var.f5332c);
        this.f8262f = new HashMap(fe1Var.f5333d);
    }
}
