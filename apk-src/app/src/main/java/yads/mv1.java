package yads;

import java.util.ArrayDeque;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class mv1 implements nq0, yw2 {
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f41029j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f41030k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public lb2 f41031l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f41033n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f41034o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f41035p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long[][] f41038s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f41039t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f41040u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f41041v;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f41028h = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ex2 f41026f = new ex2();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f41027g = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lb2 f41024d = new lb2(16);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayDeque f41025e = new ArrayDeque();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lb2 f41021a = new lb2(fy1.f38575a);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lb2 f41022b = new lb2(4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lb2 f41023c = new lb2();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f41032m = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public qq0 f41036q = qq0.f42370a;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public lv1[] f41037r = new lv1[0];

    public static /* synthetic */ h73 a(h73 h73Var) {
        return h73Var;
    }

    public static nq0[] d() {
        return new nq0[]{new mv1()};
    }

    @Override // yads.yw2
    public final boolean b() {
        return true;
    }

    @Override // yads.yw2
    public final long c() {
        return this.f41040u;
    }

    @Override // yads.nq0
    public final void seek(long j10, long j11) {
        this.f41025e.clear();
        this.f41030k = 0;
        this.f41032m = -1;
        this.f41033n = 0;
        this.f41034o = 0;
        this.f41035p = 0;
        if (j10 == 0) {
            if (this.f41028h != 3) {
                this.f41028h = 0;
                this.f41030k = 0;
                return;
            } else {
                ex2 ex2Var = this.f41026f;
                ex2Var.f38279a.clear();
                ex2Var.f38280b = 0;
                this.f41027g.clear();
                return;
            }
        }
        for (lv1 lv1Var : this.f41037r) {
            q73 q73Var = lv1Var.f40701b;
            int iB = lb3.b(q73Var.f42208f, j11, false);
            while (true) {
                if (iB < 0) {
                    iB = -1;
                    break;
                } else if ((q73Var.f42209g[iB] & 1) != 0) {
                    break;
                } else {
                    iB--;
                }
            }
            if (iB == -1) {
                iB = q73Var.a(j11);
            }
            lv1Var.f40704e = iB;
            c93 c93Var = lv1Var.f40703d;
            if (c93Var != null) {
                c93Var.f37317b = false;
                c93Var.f37318c = 0;
            }
        }
    }

    @Override // yads.nq0
    public final void a(qq0 qq0Var) {
        this.f41036q = qq0Var;
    }

    @Override // yads.yw2
    public final ww2 b(long j10) {
        long jMin;
        long jMin2;
        long j11;
        boolean z5;
        int i;
        long j12;
        long j13;
        int iA;
        long j14 = j10;
        lv1[] lv1VarArr = this.f41037r;
        if (lv1VarArr.length == 0) {
            ax2 ax2Var = ax2.f36874c;
            return new ww2(ax2Var, ax2Var);
        }
        int i10 = this.f41039t;
        boolean z10 = false;
        int i11 = -1;
        if (i10 != -1) {
            q73 q73Var = lv1VarArr[i10].f40701b;
            int iB = lb3.b(q73Var.f42208f, j14, false);
            while (true) {
                if (iB < 0) {
                    iB = -1;
                    break;
                }
                if ((q73Var.f42209g[iB] & 1) != 0) {
                    break;
                }
                iB--;
            }
            if (iB == -1) {
                iB = q73Var.a(j14);
            }
            if (iB == -1) {
                ax2 ax2Var2 = ax2.f36874c;
                return new ww2(ax2Var2, ax2Var2);
            }
            long j15 = q73Var.f42208f[iB];
            jMin = q73Var.f42205c[iB];
            if (j15 >= j14 || iB >= q73Var.f42204b - 1 || (iA = q73Var.a(j14)) == -1 || iA == iB) {
                j13 = -1;
                j11 = -9223372036854775807L;
            } else {
                j11 = q73Var.f42208f[iA];
                j13 = q73Var.f42205c[iA];
            }
            jMin2 = j13;
            j14 = j15;
        } else {
            jMin = Long.MAX_VALUE;
            jMin2 = -1;
            j11 = -9223372036854775807L;
        }
        int i12 = 0;
        while (true) {
            lv1[] lv1VarArr2 = this.f41037r;
            if (i12 >= lv1VarArr2.length) {
                break;
            }
            if (i12 != this.f41039t) {
                q73 q73Var2 = lv1VarArr2[i12].f40701b;
                int iB2 = lb3.b(q73Var2.f42208f, j14, z10);
                while (true) {
                    if (iB2 < 0) {
                        j12 = -9223372036854775807L;
                        iB2 = i11;
                        break;
                    }
                    j12 = -9223372036854775807L;
                    if ((q73Var2.f42209g[iB2] & 1) != 0) {
                        break;
                    }
                    iB2--;
                }
                if (iB2 == i11) {
                    iB2 = q73Var2.a(j14);
                }
                if (iB2 != i11) {
                    jMin = Math.min(q73Var2.f42205c[iB2], jMin);
                }
                if (j11 != j12) {
                    z5 = false;
                    int iB3 = lb3.b(q73Var2.f42208f, j11, false);
                    while (true) {
                        if (iB3 < 0) {
                            iB3 = -1;
                            break;
                        }
                        if ((q73Var2.f42209g[iB3] & 1) != 0) {
                            break;
                        }
                        iB3--;
                    }
                    i = -1;
                    if (iB3 == -1) {
                        iB3 = q73Var2.a(j11);
                    }
                    if (iB3 != -1) {
                        jMin2 = Math.min(q73Var2.f42205c[iB3], jMin2);
                    }
                } else {
                    z5 = false;
                    i = -1;
                }
            } else {
                z5 = z10;
                i = i11;
            }
            i12++;
            i11 = i;
            z10 = z5;
        }
        ax2 ax2Var3 = new ax2(j14, jMin);
        return j11 == -9223372036854775807L ? new ww2(ax2Var3, ax2Var3) : new ww2(ax2Var3, new ax2(j11, jMin2));
    }

    public final void c(long j10) {
        while (!this.f41025e.isEmpty() && ((vj) this.f41025e.peek()).f44061b == j10) {
            vj vjVar = (vj) this.f41025e.pop();
            if (vjVar.f44730a == 1836019574) {
                a(vjVar);
                this.f41025e.clear();
                this.f41028h = 2;
            } else if (!this.f41025e.isEmpty()) {
                ((vj) this.f41025e.peek()).f44063d.add(vjVar);
            }
        }
        if (this.f41028h != 2) {
            this.f41028h = 0;
            this.f41030k = 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01d6, code lost:
    
        if (r7 != 7631467) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01dd, code lost:
    
        if (r7 == 6516589) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01e2, code lost:
    
        if (r7 != 7828084) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01e9, code lost:
    
        if (r7 != 6578553) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01eb, code lost:
    
        r5 = yads.bt1.b(r6, r4, "TDRC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01f6, code lost:
    
        if (r7 != 4280916) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01f8, code lost:
    
        r5 = yads.bt1.b(r6, r4, "TPE1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0203, code lost:
    
        if (r7 != 7630703) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0205, code lost:
    
        r5 = yads.bt1.b(r6, r4, "TSSE");
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0210, code lost:
    
        if (r7 != 6384738) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0212, code lost:
    
        r5 = yads.bt1.b(r6, r4, "TALB");
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x021d, code lost:
    
        if (r7 != 7108978) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x021f, code lost:
    
        r5 = yads.bt1.b(r6, r4, "USLT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x022a, code lost:
    
        if (r7 != 6776174) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x022c, code lost:
    
        r5 = yads.bt1.b(r6, r4, "TCON");
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0235, code lost:
    
        if (r7 != 6779504) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0237, code lost:
    
        r5 = yads.bt1.b(r6, r4, "TIT1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x023f, code lost:
    
        yads.kh1.a("MetadataUtil", "Skipped unknown metadata entry: " + yads.xj.a(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0252, code lost:
    
        r4.e(r13);
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0257, code lost:
    
        r5 = yads.bt1.b(r6, r4, "TCOM");
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x025f, code lost:
    
        r5 = yads.bt1.b(r6, r4, "TIT2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x026a, code lost:
    
        if (r7 == null) goto L314;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x026c, code lost:
    
        r11.add(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x026f, code lost:
    
        r8 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0279, code lost:
    
        r4.e(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x027c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x027d, code lost:
    
        r26 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0283, code lost:
    
        if (r11.isEmpty() == false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0286, code lost:
    
        r14 = new yads.vs1(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0074, code lost:
    
        r4.e(r9);
        r9 = r9 + r11;
        r4.e(r4.f40464b + 8);
        r11 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0084, code lost:
    
        r13 = r4.f40464b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0086, code lost:
    
        if (r13 >= r9) goto L312;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0088, code lost:
    
        r13 = r4.b() + r13;
        r6 = r4.b();
        r7 = (r6 >> 24) & kotlin.KotlinVersion.MAX_COMPONENT_VALUE;
        r26 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a0, code lost:
    
        if (r7 == 169) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a4, code lost:
    
        if (r7 != 253) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ac, code lost:
    
        if (r6 != 1735291493) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ae, code lost:
    
        r4.e(r4.f40464b + 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bc, code lost:
    
        if (r4.b() != 1684108385) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00be, code lost:
    
        r4.e(r4.f40464b + 8);
        r6 = r4.m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ca, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00cd, code lost:
    
        yads.kh1.d("MetadataUtil", "Failed to parse uint8 attribute value");
        r6 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d3, code lost:
    
        if (r6 <= 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d5, code lost:
    
        r7 = yads.bt1.f37140a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d9, code lost:
    
        if (r6 > 192) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00db, code lost:
    
        r6 = r7[r6 - 1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e0, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e1, code lost:
    
        if (r6 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e3, code lost:
    
        r7 = new yads.b63("TCON", null, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00eb, code lost:
    
        yads.kh1.d("MetadataUtil", "Failed to parse standard genre code");
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f8, code lost:
    
        if (r6 != 1684632427) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00fa, code lost:
    
        r5 = yads.bt1.a(r6, r4, "TPOS");
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0104, code lost:
    
        if (r6 != 1953655662) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0106, code lost:
    
        r5 = yads.bt1.a(r6, r4, "TRCK");
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0110, code lost:
    
        if (r6 != 1953329263) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0112, code lost:
    
        r5 = yads.bt1.a(r6, "TBPM", r4, true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x011a, code lost:
    
        r7 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0121, code lost:
    
        if (r6 != 1668311404) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0123, code lost:
    
        r7 = yads.bt1.a(r6, "TCMP", r4, true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x012f, code lost:
    
        if (r6 != 1668249202) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0131, code lost:
    
        r7 = yads.bt1.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x013a, code lost:
    
        if (r6 != 1631670868) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x013c, code lost:
    
        r5 = yads.bt1.b(r6, r4, "TPE2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0146, code lost:
    
        if (r6 != 1936682605) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0148, code lost:
    
        r5 = yads.bt1.b(r6, r4, "TSOT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0152, code lost:
    
        if (r6 != 1936679276) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0154, code lost:
    
        r5 = yads.bt1.b(r6, r4, "TSO2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x015e, code lost:
    
        if (r6 != 1936679282) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0160, code lost:
    
        r5 = yads.bt1.b(r6, r4, "TSOA");
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x016a, code lost:
    
        if (r6 != 1936679265) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x016c, code lost:
    
        r5 = yads.bt1.b(r6, r4, "TSOP");
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0176, code lost:
    
        if (r6 != 1936679791) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0178, code lost:
    
        r5 = yads.bt1.b(r6, r4, "TSOC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0182, code lost:
    
        if (r6 != 1920233063) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0184, code lost:
    
        r5 = yads.bt1.a(r6, "ITUNESADVISORY", r4, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0190, code lost:
    
        if (r6 != 1885823344) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0192, code lost:
    
        r5 = yads.bt1.a(r6, "ITUNESGAPLESS", r4, false, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x019d, code lost:
    
        if (r6 != 1936683886) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x019f, code lost:
    
        r5 = yads.bt1.b(r6, r4, "TVSHOWSORT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01aa, code lost:
    
        if (r6 != 1953919848) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01ac, code lost:
    
        r5 = yads.bt1.b(r6, r4, "TVSHOW");
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01b7, code lost:
    
        if (r6 != 757935405) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01b9, code lost:
    
        r7 = yads.bt1.b(r13, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01bf, code lost:
    
        r7 = 16777215 & r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01c6, code lost:
    
        if (r7 != 6516084) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01c8, code lost:
    
        r7 = yads.bt1.a(r6, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01d1, code lost:
    
        if (r7 == 7233901) goto L131;
     */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x050b A[PHI: r3
      0x050b: PHI (r3v10 yads.az0) = (r3v3 yads.az0), (r3v3 yads.az0), (r3v5 yads.az0), (r3v3 yads.az0) binds: [B:246:0x050f, B:247:0x0511, B:331:0x050b, B:242:0x0505] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0569  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(yads.vj r29) {
        /*
            Method dump skipped, instruction units count: 1571
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.mv1.a(yads.vj):void");
    }

    @Override // yads.nq0
    public final void release() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0098  */
    @Override // yads.nq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(yads.oq0 r45, yads.ig2 r46) throws yads.qb2 {
        /*
            Method dump skipped, instruction units count: 1770
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.mv1.a(yads.oq0, yads.ig2):int");
    }

    @Override // yads.nq0
    public final boolean a(oq0 oq0Var) {
        return v13.a(oq0Var, false, false);
    }
}
