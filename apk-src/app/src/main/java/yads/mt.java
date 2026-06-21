package yads;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.vk.api.sdk.exceptions.VKApiCodes;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.KotlinVersion;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class mt extends pt {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final lb2 f41000g = new lb2();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final kb2 f41001h = new kb2();
    public int i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f41002j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final kt[] f41003k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public kt f41004l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public List f41005m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List f41006n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public lt f41007o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f41008p;

    public mt(int i, List list) {
        this.f41002j = i == -1 ? 1 : i;
        if (list != null) {
            jx.a(list);
        }
        this.f41003k = new kt[8];
        for (int i10 = 0; i10 < 8; i10++) {
            this.f41003k[i10] = new kt();
        }
        this.f41004l = this.f41003k[0];
    }

    @Override // yads.pt
    public final void a(nt ntVar) {
        ByteBuffer byteBuffer = ntVar.f42864d;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        lb2 lb2Var = this.f41000g;
        int iLimit = byteBuffer.limit();
        lb2Var.f40463a = bArrArray;
        lb2Var.f40465c = iLimit;
        lb2Var.f40464b = 0;
        while (true) {
            lb2 lb2Var2 = this.f41000g;
            if (lb2Var2.f40465c - lb2Var2.f40464b < 3) {
                return;
            }
            int iM = lb2Var2.m();
            int i = iM & 3;
            boolean z5 = (iM & 4) == 4;
            byte bM = (byte) this.f41000g.m();
            byte bM2 = (byte) this.f41000g.m();
            if (i == 2 || i == 3) {
                if (z5) {
                    if (i == 3) {
                        g();
                        int i10 = (bM & 192) >> 6;
                        int i11 = this.i;
                        if (i11 != -1 && i10 != (i11 + 1) % 4) {
                            for (int i12 = 0; i12 < 8; i12++) {
                                this.f41003k[i12].b();
                            }
                            kh1.d("Cea708Decoder", "Sequence number discontinuity. previous=" + this.i + " current=" + i10);
                        }
                        this.i = i10;
                        int i13 = bM & 63;
                        if (i13 == 0) {
                            i13 = 64;
                        }
                        lt ltVar = new lt(i10, i13);
                        this.f41007o = ltVar;
                        byte[] bArr = ltVar.f40659c;
                        ltVar.f40660d = 1;
                        bArr[0] = bM2;
                    } else {
                        if (i != 2) {
                            throw new IllegalArgumentException();
                        }
                        lt ltVar2 = this.f41007o;
                        if (ltVar2 == null) {
                            kh1.b("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = ltVar2.f40659c;
                            int i14 = ltVar2.f40660d;
                            bArr2[i14] = bM;
                            ltVar2.f40660d = i14 + 2;
                            bArr2[i14 + 1] = bM2;
                        }
                    }
                    lt ltVar3 = this.f41007o;
                    if (ltVar3.f40660d == (ltVar3.f40658b * 2) - 1) {
                        g();
                    }
                } else {
                    continue;
                }
            }
        }
    }

    @Override // yads.pt
    public final qt c() {
        List list = this.f41005m;
        this.f41006n = list;
        list.getClass();
        return new qt(list);
    }

    @Override // yads.pt
    public final boolean f() {
        return this.f41005m != this.f41006n;
    }

    @Override // yads.pt, yads.oa0
    public final void flush() {
        super.flush();
        this.f41005m = null;
        this.f41006n = null;
        this.f41008p = 0;
        this.f41004l = this.f41003k[0];
        for (int i = 0; i < 8; i++) {
            this.f41003k[i].b();
        }
        this.f41007o = null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:57:0x0151. Please report as an issue. */
    public final void g() {
        int i;
        boolean z5;
        int i10;
        int i11;
        char c8;
        lt ltVar = this.f41007o;
        if (ltVar == null) {
            return;
        }
        int i12 = 2;
        boolean z10 = true;
        if (ltVar.f40660d != (ltVar.f40658b * 2) - 1) {
            kh1.a("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f41007o.f40658b * 2) - 1) + ", but current index is " + this.f41007o.f40660d + " (sequence number " + this.f41007o.f40657a + ");");
        }
        kb2 kb2Var = this.f41001h;
        lt ltVar2 = this.f41007o;
        kb2Var.a(ltVar2.f40660d, ltVar2.f40659c);
        boolean z11 = false;
        while (true) {
            if (this.f41001h.b() > 0) {
                int i13 = 3;
                int iA = this.f41001h.a(3);
                int iA2 = this.f41001h.a(5);
                int i14 = 7;
                if (iA == 7) {
                    this.f41001h.c(i12);
                    iA = this.f41001h.a(6);
                    if (iA < 7) {
                        mf1.a("Invalid extended service number: ", iA, "Cea708Decoder");
                    }
                }
                if (iA2 == 0) {
                    if (iA != 0) {
                        kh1.d("Cea708Decoder", "serviceNumber is non-zero (" + iA + ") when blockSize is 0");
                    }
                } else if (iA != this.f41002j) {
                    this.f41001h.d(iA2);
                } else {
                    int iD = (iA2 * 8) + this.f41001h.d();
                    while (this.f41001h.d() < iD) {
                        int iA3 = this.f41001h.a(8);
                        if (iA3 == 16) {
                            i = i13;
                            z5 = true;
                            int iA4 = this.f41001h.a(8);
                            if (iA4 <= 31) {
                                i10 = 7;
                                if (iA4 > 7) {
                                    if (iA4 <= 15) {
                                        this.f41001h.c(8);
                                    } else if (iA4 <= 23) {
                                        this.f41001h.c(16);
                                    } else if (iA4 <= 31) {
                                        this.f41001h.c(24);
                                    }
                                }
                            } else {
                                i10 = 7;
                                if (iA4 <= 127) {
                                    if (iA4 == 32) {
                                        this.f41004l.a(' ');
                                    } else if (iA4 == 33) {
                                        this.f41004l.a((char) 160);
                                    } else if (iA4 == 37) {
                                        this.f41004l.a((char) 8230);
                                    } else if (iA4 == 42) {
                                        this.f41004l.a((char) 352);
                                    } else if (iA4 == 44) {
                                        this.f41004l.a((char) 338);
                                    } else if (iA4 == 63) {
                                        this.f41004l.a((char) 376);
                                    } else if (iA4 == 57) {
                                        this.f41004l.a((char) 8482);
                                    } else if (iA4 == 58) {
                                        this.f41004l.a((char) 353);
                                    } else if (iA4 == 60) {
                                        this.f41004l.a((char) 339);
                                    } else if (iA4 != 61) {
                                        switch (iA4) {
                                            case 48:
                                                this.f41004l.a((char) 9608);
                                                break;
                                            case 49:
                                                this.f41004l.a((char) 8216);
                                                break;
                                            case 50:
                                                this.f41004l.a((char) 8217);
                                                break;
                                            case 51:
                                                this.f41004l.a((char) 8220);
                                                break;
                                            case 52:
                                                this.f41004l.a((char) 8221);
                                                break;
                                            case 53:
                                                this.f41004l.a((char) 8226);
                                                break;
                                            default:
                                                switch (iA4) {
                                                    case 118:
                                                        this.f41004l.a((char) 8539);
                                                        break;
                                                    case 119:
                                                        this.f41004l.a((char) 8540);
                                                        break;
                                                    case 120:
                                                        this.f41004l.a((char) 8541);
                                                        break;
                                                    case 121:
                                                        this.f41004l.a((char) 8542);
                                                        break;
                                                    case 122:
                                                        this.f41004l.a((char) 9474);
                                                        break;
                                                    case 123:
                                                        this.f41004l.a((char) 9488);
                                                        break;
                                                    case 124:
                                                        this.f41004l.a((char) 9492);
                                                        break;
                                                    case 125:
                                                        this.f41004l.a((char) 9472);
                                                        break;
                                                    case 126:
                                                        this.f41004l.a((char) 9496);
                                                        break;
                                                    case 127:
                                                        this.f41004l.a((char) 9484);
                                                        break;
                                                    default:
                                                        mf1.a("Invalid G2 character: ", iA4, "Cea708Decoder");
                                                        break;
                                                }
                                                break;
                                        }
                                    } else {
                                        this.f41004l.a((char) 8480);
                                    }
                                    i11 = 2;
                                    c8 = 6;
                                    z11 = z5;
                                    i13 = i;
                                    i12 = i11;
                                    i14 = i10;
                                    z10 = z11;
                                } else {
                                    if (iA4 > 159) {
                                        i11 = 2;
                                        c8 = 6;
                                        if (iA4 <= 255) {
                                            if (iA4 == 160) {
                                                this.f41004l.a((char) 13252);
                                            } else {
                                                mf1.a("Invalid G3 character: ", iA4, "Cea708Decoder");
                                                this.f41004l.a('_');
                                            }
                                            z11 = z5;
                                            i13 = i;
                                            i12 = i11;
                                            i14 = i10;
                                            z10 = z11;
                                        } else {
                                            mf1.a("Invalid extended command: ", iA4, "Cea708Decoder");
                                        }
                                    } else if (iA4 <= 135) {
                                        this.f41001h.c(32);
                                    } else if (iA4 <= 143) {
                                        this.f41001h.c(40);
                                    } else if (iA4 <= 159) {
                                        i11 = 2;
                                        this.f41001h.c(2);
                                        c8 = 6;
                                        this.f41001h.c(this.f41001h.a(6) * 8);
                                    }
                                    int i15 = i11;
                                    z10 = z5;
                                    i12 = i15;
                                    i13 = i;
                                    i14 = i10;
                                }
                            }
                            i11 = 2;
                            c8 = 6;
                            int i152 = i11;
                            z10 = z5;
                            i12 = i152;
                            i13 = i;
                            i14 = i10;
                        } else if (iA3 <= 31) {
                            if (iA3 != 0) {
                                if (iA3 == i13) {
                                    this.f41005m = h();
                                } else if (iA3 != 8) {
                                    switch (iA3) {
                                        case 12:
                                            for (int i16 = 0; i16 < 8; i16++) {
                                                this.f41003k[i16].b();
                                            }
                                            break;
                                        case 13:
                                            this.f41004l.a('\n');
                                            break;
                                        case 14:
                                            break;
                                        default:
                                            if (iA3 >= 17 && iA3 <= 23) {
                                                mf1.a("Currently unsupported COMMAND_EXT1 Command: ", iA3, "Cea708Decoder");
                                                this.f41001h.c(8);
                                            } else if (iA3 < 24 || iA3 > 31) {
                                                mf1.a("Invalid C0 command: ", iA3, "Cea708Decoder");
                                            } else {
                                                mf1.a("Currently unsupported COMMAND_P16 Command: ", iA3, "Cea708Decoder");
                                                this.f41001h.c(16);
                                            }
                                            break;
                                    }
                                } else {
                                    kt ktVar = this.f41004l;
                                    int length = ktVar.f40325b.length();
                                    if (length > 0) {
                                        ktVar.f40325b.delete(length - 1, length);
                                    }
                                }
                            }
                            i11 = i12;
                            i10 = i14;
                            z5 = true;
                            c8 = 6;
                            i = i13;
                            int i1522 = i11;
                            z10 = z5;
                            i12 = i1522;
                            i13 = i;
                            i14 = i10;
                        } else {
                            if (iA3 > 127) {
                                if (iA3 <= 159) {
                                    switch (iA3) {
                                        case 128:
                                        case VKApiCodes.CODE_INVALID_PHOTO_FORMAT /* 129 */:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                            i = i13;
                                            z5 = true;
                                            int i17 = iA3 - 128;
                                            if (this.f41008p != i17) {
                                                this.f41008p = i17;
                                                this.f41004l = this.f41003k[i17];
                                            }
                                            break;
                                        case 136:
                                            i = i13;
                                            z5 = true;
                                            for (int i18 = 1; i18 <= 8; i18++) {
                                                if (this.f41001h.e()) {
                                                    kt ktVar2 = this.f41003k[8 - i18];
                                                    ktVar2.f40324a.clear();
                                                    ktVar2.f40325b.clear();
                                                    ktVar2.f40338p = -1;
                                                    ktVar2.f40339q = -1;
                                                    ktVar2.f40340r = -1;
                                                    ktVar2.f40342t = -1;
                                                    ktVar2.f40344v = 0;
                                                }
                                            }
                                            break;
                                        case 137:
                                            i = i13;
                                            for (int i19 = 1; i19 <= 8; i19++) {
                                                if (this.f41001h.e()) {
                                                    this.f41003k[8 - i19].f40327d = true;
                                                }
                                            }
                                            z5 = true;
                                            i11 = 2;
                                            i10 = 7;
                                            c8 = 6;
                                            break;
                                        case 138:
                                            i = i13;
                                            for (int i20 = 1; i20 <= 8; i20++) {
                                                if (this.f41001h.e()) {
                                                    this.f41003k[8 - i20].f40327d = false;
                                                }
                                            }
                                            z5 = true;
                                            i11 = 2;
                                            i10 = 7;
                                            c8 = 6;
                                            break;
                                        case 139:
                                            i = i13;
                                            for (int i21 = 1; i21 <= 8; i21++) {
                                                if (this.f41001h.e()) {
                                                    this.f41003k[8 - i21].f40327d = !r2.f40327d;
                                                }
                                            }
                                            z5 = true;
                                            i11 = 2;
                                            i10 = 7;
                                            c8 = 6;
                                            break;
                                        case 140:
                                            i = i13;
                                            for (int i22 = 1; i22 <= 8; i22++) {
                                                if (this.f41001h.e()) {
                                                    this.f41003k[8 - i22].b();
                                                }
                                            }
                                            z5 = true;
                                            i11 = 2;
                                            i10 = 7;
                                            c8 = 6;
                                            break;
                                        case 141:
                                            i = i13;
                                            this.f41001h.c(8);
                                            z5 = true;
                                            i11 = 2;
                                            i10 = 7;
                                            c8 = 6;
                                            break;
                                        case 142:
                                            i = i13;
                                            i11 = i12;
                                            z5 = true;
                                            i10 = 7;
                                            c8 = 6;
                                            break;
                                        case 143:
                                            i = i13;
                                            for (int i23 = 0; i23 < 8; i23++) {
                                                this.f41003k[i23].b();
                                            }
                                            z5 = true;
                                            i11 = 2;
                                            i10 = 7;
                                            c8 = 6;
                                            break;
                                        case 144:
                                            if (this.f41004l.f40326c) {
                                                this.f41001h.a(4);
                                                this.f41001h.a(2);
                                                this.f41001h.a(2);
                                                boolean zE = this.f41001h.e();
                                                boolean zE2 = this.f41001h.e();
                                                i = 3;
                                                this.f41001h.a(3);
                                                this.f41001h.a(3);
                                                this.f41004l.a(zE, zE2);
                                                z5 = true;
                                                i11 = 2;
                                                i10 = 7;
                                                c8 = 6;
                                            } else {
                                                this.f41001h.c(16);
                                                z5 = true;
                                                i11 = 2;
                                                i10 = 7;
                                                i = 3;
                                                c8 = 6;
                                            }
                                            break;
                                        case 145:
                                            if (this.f41004l.f40326c) {
                                                int iA5 = kt.a(this.f41001h.a(2), this.f41001h.a(2), this.f41001h.a(2), this.f41001h.a(2));
                                                int iA6 = kt.a(this.f41001h.a(2), this.f41001h.a(2), this.f41001h.a(2), this.f41001h.a(2));
                                                this.f41001h.c(2);
                                                kt.a(this.f41001h.a(2), this.f41001h.a(2), this.f41001h.a(2), 0);
                                                this.f41004l.a(iA5, iA6);
                                            } else {
                                                this.f41001h.c(24);
                                            }
                                            z5 = true;
                                            i11 = 2;
                                            i10 = 7;
                                            i = 3;
                                            c8 = 6;
                                            break;
                                        case 146:
                                            if (this.f41004l.f40326c) {
                                                this.f41001h.c(4);
                                                int iA7 = this.f41001h.a(4);
                                                this.f41001h.c(2);
                                                this.f41001h.a(6);
                                                kt ktVar3 = this.f41004l;
                                                if (ktVar3.f40344v != iA7) {
                                                    ktVar3.a('\n');
                                                }
                                                ktVar3.f40344v = iA7;
                                            } else {
                                                this.f41001h.c(16);
                                            }
                                            z5 = true;
                                            i11 = 2;
                                            i10 = 7;
                                            i = 3;
                                            c8 = 6;
                                            break;
                                        case 147:
                                        case 148:
                                        case 149:
                                        case VKApiCodes.CODE_INVALID_TIMESTAMP /* 150 */:
                                        default:
                                            mf1.a("Invalid C1 command: ", iA3, "Cea708Decoder");
                                            break;
                                        case 151:
                                            if (this.f41004l.f40326c) {
                                                int iA8 = kt.a(this.f41001h.a(2), this.f41001h.a(2), this.f41001h.a(2), this.f41001h.a(2));
                                                this.f41001h.a(2);
                                                kt.a(this.f41001h.a(2), this.f41001h.a(2), this.f41001h.a(2), 0);
                                                this.f41001h.e();
                                                this.f41001h.e();
                                                this.f41001h.a(2);
                                                this.f41001h.a(2);
                                                int iA9 = this.f41001h.a(2);
                                                this.f41001h.c(8);
                                                kt ktVar4 = this.f41004l;
                                                ktVar4.f40337o = iA8;
                                                ktVar4.f40334l = iA9;
                                            } else {
                                                this.f41001h.c(32);
                                            }
                                            z5 = true;
                                            i11 = 2;
                                            i10 = 7;
                                            i = 3;
                                            c8 = 6;
                                            break;
                                        case 152:
                                        case 153:
                                        case 154:
                                        case ModuleDescriptor.MODULE_VERSION /* 155 */:
                                        case 156:
                                        case 157:
                                        case 158:
                                        case 159:
                                            int i24 = iA3 - 152;
                                            kt ktVar5 = this.f41003k[i24];
                                            this.f41001h.c(i12);
                                            boolean zE3 = this.f41001h.e();
                                            boolean zE4 = this.f41001h.e();
                                            this.f41001h.e();
                                            int iA10 = this.f41001h.a(i13);
                                            boolean zE5 = this.f41001h.e();
                                            int iA11 = this.f41001h.a(i14);
                                            int iA12 = this.f41001h.a(8);
                                            int iA13 = this.f41001h.a(4);
                                            int iA14 = this.f41001h.a(4);
                                            this.f41001h.c(i12);
                                            this.f41001h.a(6);
                                            this.f41001h.c(i12);
                                            int iA15 = this.f41001h.a(3);
                                            int iA16 = this.f41001h.a(3);
                                            ktVar5.f40326c = true;
                                            ktVar5.f40327d = zE3;
                                            ktVar5.f40333k = zE4;
                                            ktVar5.f40328e = iA10;
                                            ktVar5.f40329f = zE5;
                                            ktVar5.f40330g = iA11;
                                            ktVar5.f40331h = iA12;
                                            ktVar5.i = iA13;
                                            int i25 = iA14 + 1;
                                            if (ktVar5.f40332j != i25) {
                                                ktVar5.f40332j = i25;
                                                while (true) {
                                                    if ((zE4 && ktVar5.f40324a.size() >= ktVar5.f40332j) || ktVar5.f40324a.size() >= 15) {
                                                        ktVar5.f40324a.remove(0);
                                                    }
                                                }
                                            }
                                            if (iA15 != 0 && ktVar5.f40335m != iA15) {
                                                ktVar5.f40335m = iA15;
                                                int i26 = iA15 - 1;
                                                int i27 = kt.C[i26];
                                                boolean z12 = kt.B[i26];
                                                int i28 = kt.f40323z[i26];
                                                int i29 = kt.A[i26];
                                                int i30 = kt.f40322y[i26];
                                                ktVar5.f40337o = i27;
                                                ktVar5.f40334l = i30;
                                            }
                                            if (iA16 != 0 && ktVar5.f40336n != iA16) {
                                                ktVar5.f40336n = iA16;
                                                int i31 = iA16 - 1;
                                                int i32 = kt.E[i31];
                                                int i33 = kt.D[i31];
                                                ktVar5.a(false, false);
                                                ktVar5.a(kt.f40320w, kt.F[i31]);
                                            }
                                            if (this.f41008p != i24) {
                                                this.f41008p = i24;
                                                this.f41004l = this.f41003k[i24];
                                            }
                                            z5 = true;
                                            i11 = 2;
                                            i10 = 7;
                                            i = 3;
                                            c8 = 6;
                                            break;
                                    }
                                    z11 = z5;
                                    i13 = i;
                                    i12 = i11;
                                    i14 = i10;
                                    z10 = z11;
                                } else {
                                    i = i13;
                                    z5 = true;
                                    if (iA3 <= 255) {
                                        this.f41004l.a((char) (iA3 & KotlinVersion.MAX_COMPONENT_VALUE));
                                    } else {
                                        mf1.a("Invalid base command: ", iA3, "Cea708Decoder");
                                        i11 = 2;
                                        i10 = 7;
                                        c8 = 6;
                                        int i15222 = i11;
                                        z10 = z5;
                                        i12 = i15222;
                                        i13 = i;
                                        i14 = i10;
                                    }
                                }
                                i11 = 2;
                                i10 = 7;
                                c8 = 6;
                                z11 = z5;
                                i13 = i;
                                i12 = i11;
                                i14 = i10;
                                z10 = z11;
                            } else if (iA3 == 127) {
                                this.f41004l.a((char) 9835);
                            } else {
                                this.f41004l.a((char) (iA3 & KotlinVersion.MAX_COMPONENT_VALUE));
                            }
                            i11 = i12;
                            i10 = i14;
                            z5 = true;
                            c8 = 6;
                            i = i13;
                            z11 = z5;
                            i13 = i;
                            i12 = i11;
                            i14 = i10;
                            z10 = z11;
                        }
                    }
                    z10 = z10;
                    i12 = i12;
                }
            }
        }
        if (z11) {
            this.f41005m = h();
        }
        this.f41007o = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List h() {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.mt.h():java.util.List");
    }
}
