package o5;

import android.text.SpannableStringBuilder;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.y2;
import com.google.android.gms.internal.measurement.h5;
import com.vk.api.sdk.exceptions.VKApiCodes;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import k6.t0;
import kotlin.KotlinVersion;
import m3.p;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p f29761h = new p();
    public final y2 i = new y2();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f29762j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f29763k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e[] f29764l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public e f29765m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List f29766n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List f29767o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public y2 f29768p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f29769q;

    public f(int i, List list) {
        this.f29763k = i == -1 ? 1 : i;
        if (list != null) {
            byte[] bArr = m3.d.f28554a;
            if (list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
                byte b2 = ((byte[]) list.get(0))[0];
            }
        }
        this.f29764l = new e[8];
        for (int i10 = 0; i10 < 8; i10++) {
            this.f29764l[i10] = new e();
        }
        this.f29765m = this.f29764l[0];
    }

    @Override // o5.h
    public final t0 f() {
        List list = this.f29766n;
        this.f29767o = list;
        list.getClass();
        return new t0(5, list);
    }

    @Override // o5.h, r3.c
    public final void flush() {
        super.flush();
        this.f29766n = null;
        this.f29767o = null;
        this.f29769q = 0;
        this.f29765m = this.f29764l[0];
        l();
        this.f29768p = null;
    }

    @Override // o5.h
    public final void g(g gVar) {
        ByteBuffer byteBuffer = gVar.f32192f;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        p pVar = this.f29761h;
        pVar.K(iLimit, bArrArray);
        while (pVar.a() >= 3) {
            int iZ = pVar.z();
            int i = iZ & 3;
            boolean z5 = (iZ & 4) == 4;
            byte bZ = (byte) pVar.z();
            byte bZ2 = (byte) pVar.z();
            if (i == 2 || i == 3) {
                if (z5) {
                    if (i == 3) {
                        j();
                        int i10 = (bZ & 192) >> 6;
                        int i11 = this.f29762j;
                        if (i11 != -1 && i10 != (i11 + 1) % 4) {
                            l();
                            m3.b.s("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f29762j + " current=" + i10);
                        }
                        this.f29762j = i10;
                        int i12 = bZ & 63;
                        if (i12 == 0) {
                            i12 = 64;
                        }
                        y2 y2Var = new y2(i10, i12);
                        this.f29768p = y2Var;
                        byte[] bArr = y2Var.f12462b;
                        y2Var.f12465e = 1;
                        bArr[0] = bZ2;
                    } else {
                        h5.h(i == 2);
                        y2 y2Var2 = this.f29768p;
                        if (y2Var2 == null) {
                            m3.b.e("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = y2Var2.f12462b;
                            int i13 = y2Var2.f12465e;
                            int i14 = i13 + 1;
                            y2Var2.f12465e = i14;
                            bArr2[i13] = bZ;
                            y2Var2.f12465e = i13 + 2;
                            bArr2[i14] = bZ2;
                        }
                    }
                    y2 y2Var3 = this.f29768p;
                    if (y2Var3.f12465e == (y2Var3.f12464d * 2) - 1) {
                        j();
                    }
                }
            }
        }
    }

    @Override // o5.h
    public final boolean i() {
        return this.f29766n != this.f29767o;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void j() {
        char c8;
        int i;
        boolean z5;
        y2 y2Var = this.f29768p;
        if (y2Var == null) {
            return;
        }
        int i10 = 2;
        if (y2Var.f12465e != (y2Var.f12464d * 2) - 1) {
            m3.b.d("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f29768p.f12464d * 2) - 1) + ", but current index is " + this.f29768p.f12465e + " (sequence number " + this.f29768p.f12463c + ");");
        }
        y2 y2Var2 = this.f29768p;
        byte[] bArr = y2Var2.f12462b;
        int i11 = y2Var2.f12465e;
        y2 y2Var3 = this.i;
        y2Var3.o(i11, bArr);
        boolean z10 = false;
        while (true) {
            if (y2Var3.b() > 0) {
                int i12 = 3;
                int i13 = y2Var3.i(3);
                int i14 = y2Var3.i(5);
                if (i13 == 7) {
                    y2Var3.t(i10);
                    i13 = y2Var3.i(6);
                    if (i13 < 7) {
                        gf.a.p(i13, "Invalid extended service number: ", "Cea708Decoder");
                    }
                }
                if (i14 == 0) {
                    if (i13 != 0) {
                        m3.b.s("Cea708Decoder", "serviceNumber is non-zero (" + i13 + ") when blockSize is 0");
                    }
                } else if (i13 != this.f29763k) {
                    y2Var3.u(i14);
                } else {
                    int iG = (i14 * 8) + y2Var3.g();
                    while (y2Var3.g() < iG) {
                        int i15 = y2Var3.i(8);
                        if (i15 != 16) {
                            if (i15 <= 31) {
                                if (i15 != 0) {
                                    if (i15 == i12) {
                                        this.f29766n = k();
                                    } else if (i15 != 8) {
                                        switch (i15) {
                                            case 12:
                                                l();
                                                break;
                                            case 13:
                                                this.f29765m.a('\n');
                                                break;
                                            case 14:
                                                break;
                                            default:
                                                if (i15 >= 17 && i15 <= 23) {
                                                    m3.b.s("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i15);
                                                    y2Var3.t(8);
                                                } else if (i15 < 24 || i15 > 31) {
                                                    gf.a.p(i15, "Invalid C0 command: ", "Cea708Decoder");
                                                } else {
                                                    m3.b.s("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i15);
                                                    y2Var3.t(16);
                                                }
                                                break;
                                        }
                                    } else {
                                        SpannableStringBuilder spannableStringBuilder = this.f29765m.f29742b;
                                        int length = spannableStringBuilder.length();
                                        if (length > 0) {
                                            spannableStringBuilder.delete(length - 1, length);
                                        }
                                    }
                                }
                                i = i10;
                            } else if (i15 <= 127) {
                                if (i15 == 127) {
                                    this.f29765m.a((char) 9835);
                                } else {
                                    this.f29765m.a((char) (i15 & KotlinVersion.MAX_COMPONENT_VALUE));
                                }
                                i = i10;
                                z10 = true;
                            } else {
                                if (i15 <= 159) {
                                    e[] eVarArr = this.f29764l;
                                    switch (i15) {
                                        case 128:
                                        case VKApiCodes.CODE_INVALID_PHOTO_FORMAT /* 129 */:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                            z5 = true;
                                            int i16 = i15 - 128;
                                            if (this.f29769q != i16) {
                                                this.f29769q = i16;
                                                this.f29765m = eVarArr[i16];
                                            }
                                            break;
                                        case 136:
                                            z5 = true;
                                            for (int i17 = 1; i17 <= 8; i17++) {
                                                if (y2Var3.h()) {
                                                    e eVar = eVarArr[8 - i17];
                                                    eVar.f29741a.clear();
                                                    eVar.f29742b.clear();
                                                    eVar.f29754o = -1;
                                                    eVar.f29755p = -1;
                                                    eVar.f29756q = -1;
                                                    eVar.f29758s = -1;
                                                    eVar.f29760u = 0;
                                                }
                                            }
                                            break;
                                        case 137:
                                            for (int i18 = 1; i18 <= 8; i18++) {
                                                if (y2Var3.h()) {
                                                    eVarArr[8 - i18].f29744d = true;
                                                }
                                            }
                                            z5 = true;
                                            break;
                                        case 138:
                                            for (int i19 = 1; i19 <= 8; i19++) {
                                                if (y2Var3.h()) {
                                                    eVarArr[8 - i19].f29744d = false;
                                                }
                                            }
                                            z5 = true;
                                            break;
                                        case 139:
                                            for (int i20 = 1; i20 <= 8; i20++) {
                                                if (y2Var3.h()) {
                                                    eVarArr[8 - i20].f29744d = !r1.f29744d;
                                                }
                                            }
                                            z5 = true;
                                            break;
                                        case 140:
                                            for (int i21 = 1; i21 <= 8; i21++) {
                                                if (y2Var3.h()) {
                                                    eVarArr[8 - i21].d();
                                                }
                                            }
                                            z5 = true;
                                            break;
                                        case 141:
                                            y2Var3.t(8);
                                            z5 = true;
                                            break;
                                        case 142:
                                            z5 = true;
                                            break;
                                        case 143:
                                            l();
                                            z5 = true;
                                            break;
                                        case 144:
                                            int i22 = i10;
                                            if (this.f29765m.f29743c) {
                                                y2Var3.i(4);
                                                y2Var3.i(i22);
                                                y2Var3.i(i22);
                                                boolean zH = y2Var3.h();
                                                boolean zH2 = y2Var3.h();
                                                i12 = 3;
                                                y2Var3.i(3);
                                                y2Var3.i(3);
                                                this.f29765m.e(zH, zH2);
                                                z5 = true;
                                            } else {
                                                y2Var3.t(16);
                                                z5 = true;
                                                i12 = 3;
                                            }
                                            break;
                                        case 145:
                                            if (this.f29765m.f29743c) {
                                                int iC = e.c(y2Var3.i(2), y2Var3.i(2), y2Var3.i(2), y2Var3.i(2));
                                                int iC2 = e.c(y2Var3.i(2), y2Var3.i(2), y2Var3.i(2), y2Var3.i(2));
                                                y2Var3.t(2);
                                                e.c(y2Var3.i(2), y2Var3.i(2), y2Var3.i(2), 0);
                                                this.f29765m.f(iC, iC2);
                                            } else {
                                                y2Var3.t(24);
                                            }
                                            z5 = true;
                                            i12 = 3;
                                            break;
                                        case 146:
                                            if (this.f29765m.f29743c) {
                                                y2Var3.t(4);
                                                int i23 = y2Var3.i(4);
                                                y2Var3.t(2);
                                                y2Var3.i(6);
                                                e eVar2 = this.f29765m;
                                                if (eVar2.f29760u != i23) {
                                                    eVar2.a('\n');
                                                }
                                                eVar2.f29760u = i23;
                                            } else {
                                                y2Var3.t(16);
                                            }
                                            z5 = true;
                                            i12 = 3;
                                            break;
                                        case 147:
                                        case 148:
                                        case 149:
                                        case VKApiCodes.CODE_INVALID_TIMESTAMP /* 150 */:
                                        default:
                                            gf.a.p(i15, "Invalid C1 command: ", "Cea708Decoder");
                                            z5 = true;
                                            break;
                                        case 151:
                                            if (this.f29765m.f29743c) {
                                                int iC3 = e.c(y2Var3.i(2), y2Var3.i(2), y2Var3.i(2), y2Var3.i(2));
                                                y2Var3.i(2);
                                                e.c(y2Var3.i(2), y2Var3.i(2), y2Var3.i(2), 0);
                                                y2Var3.h();
                                                y2Var3.h();
                                                y2Var3.i(2);
                                                y2Var3.i(2);
                                                int i24 = y2Var3.i(2);
                                                y2Var3.t(8);
                                                e eVar3 = this.f29765m;
                                                eVar3.f29753n = iC3;
                                                eVar3.f29750k = i24;
                                            } else {
                                                y2Var3.t(32);
                                            }
                                            z5 = true;
                                            i12 = 3;
                                            break;
                                        case 152:
                                        case 153:
                                        case 154:
                                        case ModuleDescriptor.MODULE_VERSION /* 155 */:
                                        case 156:
                                        case 157:
                                        case 158:
                                        case 159:
                                            int i25 = i15 - 152;
                                            e eVar4 = eVarArr[i25];
                                            y2Var3.t(i10);
                                            boolean zH3 = y2Var3.h();
                                            y2Var3.t(i10);
                                            int i26 = y2Var3.i(i12);
                                            boolean zH4 = y2Var3.h();
                                            int i27 = y2Var3.i(7);
                                            int i28 = y2Var3.i(8);
                                            int i29 = y2Var3.i(4);
                                            int i30 = y2Var3.i(4);
                                            y2Var3.t(i10);
                                            y2Var3.t(6);
                                            y2Var3.t(i10);
                                            int i31 = y2Var3.i(3);
                                            int i32 = y2Var3.i(3);
                                            ArrayList arrayList = eVar4.f29741a;
                                            eVar4.f29743c = true;
                                            eVar4.f29744d = zH3;
                                            eVar4.f29745e = i26;
                                            eVar4.f29746f = zH4;
                                            eVar4.f29747g = i27;
                                            eVar4.f29748h = i28;
                                            eVar4.i = i29;
                                            int i33 = i30 + 1;
                                            if (eVar4.f29749j != i33) {
                                                eVar4.f29749j = i33;
                                                while (true) {
                                                    if (arrayList.size() >= eVar4.f29749j || arrayList.size() >= 15) {
                                                        arrayList.remove(0);
                                                    }
                                                }
                                            }
                                            if (i31 != 0 && eVar4.f29751l != i31) {
                                                eVar4.f29751l = i31;
                                                int i34 = i31 - 1;
                                                int i35 = e.B[i34];
                                                boolean z11 = e.A[i34];
                                                int i36 = e.f29739y[i34];
                                                int i37 = e.f29740z[i34];
                                                int i38 = e.f29738x[i34];
                                                eVar4.f29753n = i35;
                                                eVar4.f29750k = i38;
                                            }
                                            if (i32 != 0 && eVar4.f29752m != i32) {
                                                eVar4.f29752m = i32;
                                                int i39 = i32 - 1;
                                                int i40 = e.D[i39];
                                                int i41 = e.C[i39];
                                                eVar4.e(false, false);
                                                eVar4.f(e.f29736v, e.E[i39]);
                                            }
                                            if (this.f29769q != i25) {
                                                this.f29769q = i25;
                                                this.f29765m = eVarArr[i25];
                                            }
                                            z5 = true;
                                            i12 = 3;
                                            break;
                                    }
                                } else {
                                    z5 = true;
                                    if (i15 <= 255) {
                                        this.f29765m.a((char) (i15 & KotlinVersion.MAX_COMPONENT_VALUE));
                                    } else {
                                        gf.a.p(i15, "Invalid base command: ", "Cea708Decoder");
                                        i = 2;
                                        c8 = 7;
                                    }
                                }
                                z10 = z5;
                                i = 2;
                                c8 = 7;
                            }
                            c8 = 7;
                        } else {
                            int i42 = y2Var3.i(8);
                            if (i42 <= 31) {
                                c8 = 7;
                                if (i42 > 7) {
                                    if (i42 <= 15) {
                                        y2Var3.t(8);
                                    } else if (i42 <= 23) {
                                        y2Var3.t(16);
                                    } else if (i42 <= 31) {
                                        y2Var3.t(24);
                                    }
                                }
                            } else {
                                c8 = 7;
                                if (i42 <= 127) {
                                    if (i42 == 32) {
                                        this.f29765m.a(' ');
                                    } else if (i42 == 33) {
                                        this.f29765m.a((char) 160);
                                    } else if (i42 == 37) {
                                        this.f29765m.a((char) 8230);
                                    } else if (i42 == 42) {
                                        this.f29765m.a((char) 352);
                                    } else if (i42 == 44) {
                                        this.f29765m.a((char) 338);
                                    } else if (i42 == 63) {
                                        this.f29765m.a((char) 376);
                                    } else if (i42 == 57) {
                                        this.f29765m.a((char) 8482);
                                    } else if (i42 == 58) {
                                        this.f29765m.a((char) 353);
                                    } else if (i42 == 60) {
                                        this.f29765m.a((char) 339);
                                    } else if (i42 != 61) {
                                        switch (i42) {
                                            case 48:
                                                this.f29765m.a((char) 9608);
                                                break;
                                            case 49:
                                                this.f29765m.a((char) 8216);
                                                break;
                                            case 50:
                                                this.f29765m.a((char) 8217);
                                                break;
                                            case 51:
                                                this.f29765m.a((char) 8220);
                                                break;
                                            case 52:
                                                this.f29765m.a((char) 8221);
                                                break;
                                            case 53:
                                                this.f29765m.a((char) 8226);
                                                break;
                                            default:
                                                switch (i42) {
                                                    case 118:
                                                        this.f29765m.a((char) 8539);
                                                        break;
                                                    case 119:
                                                        this.f29765m.a((char) 8540);
                                                        break;
                                                    case 120:
                                                        this.f29765m.a((char) 8541);
                                                        break;
                                                    case 121:
                                                        this.f29765m.a((char) 8542);
                                                        break;
                                                    case 122:
                                                        this.f29765m.a((char) 9474);
                                                        break;
                                                    case 123:
                                                        this.f29765m.a((char) 9488);
                                                        break;
                                                    case 124:
                                                        this.f29765m.a((char) 9492);
                                                        break;
                                                    case 125:
                                                        this.f29765m.a((char) 9472);
                                                        break;
                                                    case 126:
                                                        this.f29765m.a((char) 9496);
                                                        break;
                                                    case 127:
                                                        this.f29765m.a((char) 9484);
                                                        break;
                                                    default:
                                                        gf.a.p(i42, "Invalid G2 character: ", "Cea708Decoder");
                                                        break;
                                                }
                                                break;
                                        }
                                    } else {
                                        this.f29765m.a((char) 8480);
                                    }
                                    i = 2;
                                    z10 = true;
                                } else if (i42 > 159) {
                                    i = 2;
                                    if (i42 <= 255) {
                                        if (i42 == 160) {
                                            this.f29765m.a((char) 13252);
                                        } else {
                                            gf.a.p(i42, "Invalid G3 character: ", "Cea708Decoder");
                                            this.f29765m.a('_');
                                        }
                                        z10 = true;
                                    } else {
                                        gf.a.p(i42, "Invalid extended command: ", "Cea708Decoder");
                                    }
                                } else if (i42 <= 135) {
                                    y2Var3.t(32);
                                } else if (i42 <= 143) {
                                    y2Var3.t(40);
                                } else if (i42 <= 159) {
                                    i = 2;
                                    y2Var3.t(2);
                                    y2Var3.t(y2Var3.i(6) * 8);
                                }
                            }
                            i = 2;
                        }
                        i10 = i;
                    }
                }
            }
        }
        if (z10) {
            this.f29766n = k();
        }
        this.f29768p = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List k() {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.f.k():java.util.List");
    }

    public final void l() {
        for (int i = 0; i < 8; i++) {
            this.f29764l[i].d();
        }
    }
}
