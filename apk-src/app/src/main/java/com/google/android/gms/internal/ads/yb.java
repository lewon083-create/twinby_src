package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yb implements nc {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ yb f12562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ yb f12563c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ yb f12564d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ yb f12565e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ yb f12566f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ yb f12567g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ yb f12568h;
    public static final /* synthetic */ yb i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ yb f12569j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ yb f12570k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ yb f12571l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ yb f12572m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ yb f12573n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ yb f12574o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ yb f12575p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ yb f12576q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12577a;

    static {
        int i10 = (((((~358984857) & 11257432) | 369424399) + ((358984857 & 615188052) | 873771151)) - 1245366369) ^ (1985433483 % 395279207);
        int i11 = (((((~1402492972) & 1009329808) | 1643537068) + ((1402492972 & 503911450) | 580170602)) - (-2136216298)) ^ (1489001354 % 953691761);
        int i12 = (((((~1389079342) & 405954790) | 5768193) + ((1389079342 & 967468022) | 1640566552)) - 1618010502) ^ (1588695568 % 1155465115);
        int i13 = (((((~1666231349) & 289538432) | 621649449) + ((1666231349 & 406985104) | 264059443)) - 1093855303) ^ (1698487330 % 272312086);
        int i14 = (((((~1953161956) & 2021553924) | 1308628610) + ((1953161956 & 813590916) | 134225131)) - 2074905685) ^ (1172063133 % 990526343);
        int i15 = (((((~1889804310) & 69748745) | 707083896) + ((1889804310 & 604795185) | 951435262)) - 1284100923) ^ (1663080928 % 610506582);
        int i16 = (((((~279121308) & 136482862) | 293951273) + ((279121308 & 1302561302) | 1440046744)) - 1857458389) ^ (1404515797 % 695748720);
        int i17 = (((((~1460082195) & 849562858) | 543970048) + ((1460082195 & 381881578) | 1279262981)) - 1872584419) ^ (1122336503 % 861109485);
        int i18 = (((((~70788355) & 1377181904) | 713084892) + ((70788355 & 1410740224) | 99160279)) - 1955016785) ^ (1156541312 % 318561886);
        int i19 = (((((~12895151) & 1277237303) | 185162640) + ((12895151 & 1411547303) | 306429832)) - 1475739783) ^ (1498617647 % 669908538);
        int i20 = (((((~1566288819) & 1018167620) | 793479703) + ((1566288819 & 284165456) | 1648575546)) - (-1895196318)) ^ (846942590 % 524688209);
        int i21 = (((((~1540846267) & 571107379) | 1484708373) + ((1540846267 & 709108258) | 1568035525)) - (-834164565)) ^ (2037335344 % 1874960596);
        f12576q = new yb((((((~1245644428) & 268473430) | 2019232319) + ((1245644428 & 2266696) | 1693582250)) - (-827594116)) ^ (1308581515 % 354367395));
        f12575p = new yb((((((~464837581) & 1181588952) | 603091067) + ((464837581 & 1544523140) | 967967255)) - (-2124025763)) ^ (1295815494 % 753959819));
        f12574o = new yb(i21);
        f12573n = new yb(i12);
        f12572m = new yb(i13);
        f12571l = new yb(i14);
        f12570k = new yb(i11);
        f12569j = new yb(i15);
        i = new yb(i16);
        f12568h = new yb(i17);
        f12567g = new yb(i10);
        f12566f = new yb(i18);
        f12565e = new yb(i19);
        f12564d = new yb(i20);
        f12563c = new yb(1);
        f12562b = new yb(0);
    }

    public /* synthetic */ yb(int i10) {
        this.f12577a = i10;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        qb qbVar;
        vc vcVarD;
        try {
            try {
                try {
                    try {
                        try {
                            switch (this.f12577a) {
                                case 0:
                                    return ((rc) obj).a();
                                case 1:
                                    try {
                                        mc mcVar = ((rc) obj).f9815a;
                                        long jM = mcVar.d().m();
                                        vc vcVarD2 = mcVar.d();
                                        List listO = vcVarD2.o();
                                        if (jM < 0) {
                                            jM += (long) ((ArrayList) listO).size();
                                        }
                                        if (jM >= 0) {
                                            ArrayList arrayList = (ArrayList) listO;
                                            if (jM < arrayList.size()) {
                                                arrayList.remove((int) jM);
                                                mcVar.c(vcVarD2);
                                                return Optional.empty();
                                            }
                                        }
                                        throw new uc();
                                    } catch (uc unused) {
                                        qbVar = qb.K;
                                    }
                                    break;
                                case 2:
                                    rc rcVar = (rc) obj;
                                    mc mcVar2 = rcVar.f9815a;
                                    vc vcVarD3 = mcVar2.d();
                                    ac acVarN = mcVar2.d().n();
                                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                    vcVarD3.k(byteArrayOutputStream);
                                    rcVar.f9815a.c(vc.d(acVarN.d(ac.e(byteArrayOutputStream.toByteArray()))));
                                    return Optional.empty();
                                case 3:
                                    rc rcVar2 = (rc) obj;
                                    mc mcVar3 = rcVar2.f9815a;
                                    vc vcVarD4 = mcVar3.d();
                                    ac acVarN2 = mcVar3.d().n();
                                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                    c6.v(vcVarD4.m(), new kx0(5, byteArrayOutputStream2), false);
                                    rcVar2.f9815a.c(vc.d(acVarN2.d(ac.e(byteArrayOutputStream2.toByteArray()))));
                                    return Optional.empty();
                                case 4:
                                    rc rcVar3 = (rc) obj;
                                    fc fcVar = rcVar3.f9817c;
                                    mc mcVar4 = rcVar3.f9815a;
                                    mcVar4.f7846a.set(mcVar4.b(-(rcVar3.f9816b.n().f6093b + fcVar.h())), mcVar4.d());
                                    return Optional.empty();
                                case 5:
                                    mc mcVar5 = ((rc) obj).f9815a;
                                    mcVar5.c(vc.b(mcVar5.d().m() << ((int) mcVar5.d().m())));
                                    return Optional.empty();
                                case 6:
                                    mc mcVar6 = ((rc) obj).f9815a;
                                    mcVar6.c(vc.b(mcVar6.d().m() >>> ((int) mcVar6.d().m())));
                                    return Optional.empty();
                                case 7:
                                    mc mcVar7 = ((rc) obj).f9815a;
                                    mcVar7.c(vc.c(mcVar7.d().q() - mcVar7.d().q()));
                                    return Optional.empty();
                                case 8:
                                    mc mcVar8 = ((rc) obj).f9815a;
                                    mcVar8.c(vc.b(mcVar8.d().m() - mcVar8.d().m()));
                                    return Optional.empty();
                                case 9:
                                    rc rcVar4 = (rc) obj;
                                    mc mcVar9 = rcVar4.f9815a;
                                    long jM2 = mcVar9.d().m();
                                    vc vcVarD5 = mcVar9.d();
                                    mc mcVar10 = rcVar4.f9815a;
                                    vc vcVarE = mcVar10.e(jM2);
                                    mcVar10.f7846a.set(mcVar10.b(jM2), vcVarD5);
                                    mcVar10.c(vcVarE);
                                    return Optional.empty();
                                case 10:
                                    rc rcVar5 = (rc) obj;
                                    mc mcVar11 = rcVar5.f9815a;
                                    long jM3 = rcVar5.f9816b.n().f6093b + mcVar11.d().m();
                                    vc vcVarD6 = mcVar11.d();
                                    mc mcVar12 = rcVar5.f9815a;
                                    long j10 = -jM3;
                                    vc vcVarE2 = mcVar12.e(j10);
                                    mcVar12.f7846a.set(mcVar12.b(j10), vcVarD6);
                                    mcVar12.c(vcVarE2);
                                    return Optional.empty();
                                case 11:
                                    rc rcVar6 = (rc) obj;
                                    fc fcVar2 = rcVar6.f9817c;
                                    mc mcVar13 = rcVar6.f9815a;
                                    long jH = rcVar6.f9816b.n().f6093b + fcVar2.h();
                                    vc vcVarD7 = mcVar13.d();
                                    long j11 = -jH;
                                    vc vcVarE3 = mcVar13.e(j11);
                                    mcVar13.f7846a.set(mcVar13.b(j11), vcVarD7);
                                    mcVar13.c(vcVarE3);
                                    return Optional.empty();
                                case 12:
                                    rc rcVar7 = (rc) obj;
                                    long jM4 = rcVar7.f9815a.d().m();
                                    try {
                                        mc mcVar14 = rcVar7.f9815a;
                                        if (jM4 == 0) {
                                            vcVarD = mcVar14.d();
                                        } else {
                                            mcVar14.f7847b--;
                                            vcVarD = (vc) mcVar14.f7846a.remove(mcVar14.b(jM4));
                                        }
                                        mcVar14.c(vcVarD);
                                        return Optional.empty();
                                    } catch (kc unused2) {
                                        qbVar = qb.i;
                                    }
                                    break;
                                case 13:
                                    rc rcVar8 = (rc) obj;
                                    try {
                                        mc mcVar15 = rcVar8.f9815a;
                                        long jM5 = mcVar15.d().m();
                                        long jM6 = mcVar15.d().m();
                                        gk0 gk0Var = rcVar8.f9816b;
                                        fc fcVar3 = rcVar8.f9817c;
                                        gk0Var.g(fcVar3.d(), jM6, gk0Var.n().f6093b);
                                        fcVar3.c(jM5);
                                        return Optional.empty();
                                    } catch (dc | ec unused3) {
                                        qbVar = qb.f9407t;
                                    } catch (ic unused4) {
                                        qbVar = qb.D;
                                    } catch (jc unused5) {
                                        qbVar = qb.f9412y;
                                    }
                                    break;
                                case 14:
                                    rc rcVar9 = (rc) obj;
                                    try {
                                        rcVar9.f9815a.c(vc.g(rcVar9.f9815a.d().l()));
                                        return Optional.empty();
                                    } catch (tc unused6) {
                                        qbVar = qb.f9405r;
                                    }
                                    break;
                                default:
                                    try {
                                        mc mcVar16 = ((rc) obj).f9815a;
                                        Iterator it = ((ArrayList) mcVar16.d().o()).iterator();
                                        while (it.hasNext()) {
                                            mcVar16.c((vc) it.next());
                                            break;
                                        }
                                        return Optional.empty();
                                    } catch (lc unused7) {
                                        qbVar = qb.f9391c;
                                    }
                                    break;
                            }
                        } catch (tc unused8) {
                            qbVar = qb.f9400m;
                        } catch (IOException e3) {
                            e = e3;
                            throw new AssertionError(zb.a("CEiv6BFfPnitUE+D"), e);
                        }
                    } catch (kc unused9) {
                        qbVar = qb.f9397j;
                    }
                } catch (jc | kc unused10) {
                    qbVar = qb.f9413z;
                }
            } catch (lc e7) {
                e = e7;
                throw new AssertionError(zb.a("CEiv6BFfPnitUE+D"), e);
            }
        } catch (cc | ec | tc unused11) {
            qbVar = qb.A;
        }
        return Optional.of(qbVar);
    }
}
