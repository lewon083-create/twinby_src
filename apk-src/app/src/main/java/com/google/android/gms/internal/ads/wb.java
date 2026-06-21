package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wb implements nc {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ wb f11717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ wb f11718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ wb f11719d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ wb f11720e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ wb f11721f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ wb f11722g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ wb f11723h;
    public static final /* synthetic */ wb i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ wb f11724j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ wb f11725k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ wb f11726l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ wb f11727m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ wb f11728n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ wb f11729o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ wb f11730p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ wb f11731q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ wb f11732r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ wb f11733s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ wb f11734t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ wb f11735u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ wb f11736v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11737a;

    static {
        int i10 = (((((~574682290) & 203332142) | 828655825) + ((574682290 & 488280686) | 1367367889)) - 2039730118) ^ (1891066487 % 382926234);
        int i11 = (((((~138700754) & 1311190796) | 1098494210) + ((138700754 & 235277837) | 2126145)) - 1303500118) ^ (631340353 % 54449299);
        int i12 = (((((~429857344) & 761470753) | 244716435) + ((429857344 & 862030880) | 1585885407)) - (-1912977126)) ^ (1209597698 % 1200977805);
        int i13 = (((((~353056618) & 587352576) | 1209239528) + ((353056618 & 1728108930) | 1420269559)) - (-1847305937)) ^ (1896236448 % 1127167744);
        int i14 = (((((~899633766) & 123837830) | 368257288) + ((899633766 & 167810182) | 1023429240)) - 1335244442) ^ (2104001379 % 2013966848);
        int i15 = (((((~1451163042) & 1144033732) | 979119168) + ((1451163042 & 1142985108) | 17523737)) - 1635219142) ^ (1178835412 % 674426555);
        int i16 = (((((~2129768394) & 1627076842) | 1930240353) + ((2129768394 & 384997514) | 369722160)) - (-1995771891)) ^ (1450967523 % 42186306);
        f11736v = new wb((((((~880944650) & 1717883648) | 10231720) + ((880944650 & 1718140932) | 277359766)) - 1470954277) ^ (2122533302 % 1588279465));
        f11735u = new wb((((((~2105342203) & 63587109) | 1700430907) + ((2105342203 & 42025732) | 358031402)) - 2053339984) ^ (1059789835 % 1012707329));
        f11734t = new wb((((((~217704412) & 144255288) | 1174857666) + ((217704412 & 1788447288) | 1667270208)) - (-1441824169)) ^ (1234644696 % 220282619));
        f11733s = new wb(i16);
        f11732r = new wb(i13);
        f11731q = new wb(i14);
        wb wbVar = new wb(i15);
        int i17 = (((((~363159161) & 562794784) | 672605403) + ((363159161 & 25727904) | 2081572569)) - (-1616076716)) ^ (912078408 % 135177290);
        int i18 = (((((~1362243428) & 18451060) | 1179867339) + ((1362243428 & 558662325) | 550966467)) - 1623872455) ^ (1106211926 % 327305250);
        int i19 = (((((~1725362297) & 1360741300) | 1109702041) + ((1725362297 & 354116135) | 1147188355)) - (-1834394863)) ^ (1760481135 % 279527351);
        int i20 = (((((~167368542) & 67146177) | 1656237739) + ((167368542 & 1145098568) | 1113671327)) - (-1733089599)) ^ (1999038585 % 574620392);
        int i21 = (((((~1855103807) & 659964675) | 1290440236) + ((1855103807 & 588562691) | 482511980)) - 1987315200) ^ (988506952 % 614340012);
        int i22 = (((((~309667127) & 3230344) | 101519449) + ((309667127 & 607439488) | 793023522)) - 846909944) ^ (1953534826 % 1902736997);
        int i23 = (((((~682736626) & 1985796848) | 208315317) + ((682736626 & 1922324801) | 8464129)) - 2089727599) ^ (649022765 % 608034986);
        int i24 = (((((~2068224547) & 575179716) | 1587938398) + ((2068224547 & 1013484418) | 1605526586)) - (-1152499266)) ^ (1603386966 % 1010764797);
        int i25 = (((((~1281944976) & 1463473736) | 847256033) + ((1281944976 & 1698424328) | 948255187)) - (-1974214194)) ^ (1727952741 % 1091714937);
        f11730p = wbVar;
        f11729o = new wb(i12);
        f11728n = new wb(i17);
        f11727m = new wb(i18);
        f11726l = new wb(i19);
        f11725k = new wb(i11);
        f11724j = new wb(i20);
        i = new wb(i21);
        f11723h = new wb(i22);
        f11722g = new wb(i10);
        f11721f = new wb(i23);
        f11720e = new wb(i24);
        f11719d = new wb(i25);
        f11718c = new wb(1);
        f11717b = new wb(0);
    }

    public /* synthetic */ wb(int i10) {
        this.f11737a = i10;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        qb qbVar;
        long j10 = 1;
        try {
            try {
                try {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        switch (this.f11737a) {
                                            case 0:
                                                rc rcVar = (rc) obj;
                                                mc mcVar = rcVar.f9815a;
                                                long jM = mcVar.d().m();
                                                if (mcVar.d().m() != 0) {
                                                    rcVar.f9817c.c(jM);
                                                }
                                                return Optional.empty();
                                            case 1:
                                                try {
                                                    mc mcVar2 = ((rc) obj).f9815a;
                                                    long jM2 = mcVar2.d().m();
                                                    vc vcVarD = mcVar2.d();
                                                    vc vcVarD2 = mcVar2.d();
                                                    List listO = vcVarD2.o();
                                                    if (jM2 < 0) {
                                                        jM2 += (long) (((ArrayList) listO).size() + 1);
                                                    }
                                                    if (jM2 >= 0) {
                                                        ArrayList arrayList = (ArrayList) listO;
                                                        if (jM2 < arrayList.size() + 1) {
                                                            arrayList.add((int) jM2, vcVarD);
                                                            mcVar2.c(vcVarD2);
                                                            return Optional.empty();
                                                        }
                                                    }
                                                    throw new uc();
                                                } catch (uc unused) {
                                                    qbVar = qb.K;
                                                }
                                                break;
                                            case 2:
                                                rc rcVar2 = (rc) obj;
                                                mc mcVar3 = rcVar2.f9815a;
                                                long jM3 = mcVar3.d().m();
                                                if (mcVar3.d().m() == 0) {
                                                    rcVar2.f9817c.c(jM3);
                                                }
                                                return Optional.empty();
                                            case 3:
                                                ((rc) obj).f9815a.c(vc.b(((ArrayList) r12.d().o()).size()));
                                                return Optional.empty();
                                            case 4:
                                                ((rc) obj).f9815a.c(vc.b(r12.d().n().f2838a.length));
                                                return Optional.empty();
                                            case 5:
                                                mc mcVar4 = ((rc) obj).f9815a;
                                                mcVar4.c(vc.c(Math.log(mcVar4.d().q())));
                                                return Optional.empty();
                                            case 6:
                                                mc mcVar5 = ((rc) obj).f9815a;
                                                long jM4 = mcVar5.d().m();
                                                long jM5 = mcVar5.d().m();
                                                if (jM4 == 0 || jM5 == 0) {
                                                    j10 = 0;
                                                }
                                                mcVar5.c(vc.b(j10));
                                                return Optional.empty();
                                            case 7:
                                                mc mcVar6 = ((rc) obj).f9815a;
                                                if (mcVar6.d().m() != 0) {
                                                    j10 = 0;
                                                }
                                                mcVar6.c(vc.b(j10));
                                                return Optional.empty();
                                            case 8:
                                                mc mcVar7 = ((rc) obj).f9815a;
                                                long jM6 = mcVar7.d().m();
                                                long jM7 = mcVar7.d().m();
                                                if (jM6 == 0 && jM7 == 0) {
                                                    j10 = 0;
                                                }
                                                mcVar7.c(vc.b(j10));
                                                return Optional.empty();
                                            case 9:
                                                rc rcVar3 = (rc) obj;
                                                mc mcVar8 = rcVar3.f9815a;
                                                try {
                                                    int iCompare = new sc(false).compare(mcVar8.d(), mcVar8.d());
                                                    mc mcVar9 = rcVar3.f9815a;
                                                    if (iCompare >= 0) {
                                                        j10 = 0;
                                                    }
                                                    mcVar9.c(vc.b(j10));
                                                    return Optional.empty();
                                                } catch (IllegalArgumentException unused2) {
                                                    return Optional.of(qb.f9394f);
                                                }
                                            case 10:
                                                rc rcVar4 = (rc) obj;
                                                try {
                                                    mc mcVar10 = rcVar4.f9815a;
                                                    long jM8 = mcVar10.d().m();
                                                    mc mcVar11 = new mc();
                                                    for (int i10 = 0; i10 < mcVar10.f7847b; i10++) {
                                                        try {
                                                            mcVar11.c(vc.j((vc) mcVar10.f7846a.get(i10)));
                                                        } catch (lc e3) {
                                                            throw new AssertionError(zb.a("CEiv6BFfPnitUE+D"), e3);
                                                        }
                                                        break;
                                                    }
                                                    fc fcVar = rcVar4.f9817c;
                                                    ac acVar = (ac) fcVar.f5320c;
                                                    int i11 = fcVar.f5319b;
                                                    ub ubVarMo2l = ((ub) fcVar.f5321d).mo2l();
                                                    c6 c6Var = (c6) fcVar.f5322e;
                                                    fc fcVar2 = new fc(acVar, i11, ubVarMo2l);
                                                    fcVar2.f5322e = c6Var;
                                                    new gk0(4);
                                                    fcVar2.c(jM8);
                                                    mcVar10.c(vc.a(new c6(23)));
                                                    return Optional.empty();
                                                } catch (dc | ec unused3) {
                                                    qbVar = qb.f9409v;
                                                }
                                                break;
                                            case 11:
                                                try {
                                                    mc mcVar12 = ((rc) obj).f9815a;
                                                    mcVar12.c(vc.a(mcVar12.d().i((Class) mcVar12.d().l())));
                                                    return Optional.empty();
                                                } catch (tc unused4) {
                                                    qbVar = qb.f9405r;
                                                }
                                                break;
                                            case 12:
                                                mc mcVar13 = ((rc) obj).f9815a;
                                                long jM9 = mcVar13.d().m();
                                                long jM10 = mcVar13.d().m();
                                                if (jM9 == 0) {
                                                    return Optional.of(qb.H);
                                                }
                                                mcVar13.c(vc.b(jM10 % jM9));
                                                return Optional.empty();
                                            case 13:
                                                mc mcVar14 = ((rc) obj).f9815a;
                                                mcVar14.c(vc.c(mcVar14.d().q() * mcVar14.d().q()));
                                                return Optional.empty();
                                            case 14:
                                                mc mcVar15 = ((rc) obj).f9815a;
                                                mcVar15.c(vc.b(mcVar15.d().m() * mcVar15.d().m()));
                                                return Optional.empty();
                                            case 15:
                                                mc mcVar16 = ((rc) obj).f9815a;
                                                long jM11 = mcVar16.d().m();
                                                ArrayList arrayList2 = new ArrayList();
                                                for (long j11 = 0; j11 < jM11; j11++) {
                                                    arrayList2.add(mcVar16.d());
                                                }
                                                Collections.reverse(arrayList2);
                                                mcVar16.c(vc.e(arrayList2));
                                                return Optional.empty();
                                            case 16:
                                                mc mcVar17 = ((rc) obj).f9815a;
                                                mcVar17.c(vc.c(Math.pow(mcVar17.d().q(), mcVar17.d().q())));
                                                return Optional.empty();
                                            case 17:
                                                ((rc) obj).f9815a.c(vc.a(null));
                                                return Optional.empty();
                                            case 18:
                                                rc rcVar5 = (rc) obj;
                                                ByteBuffer byteBufferWrap = ByteBuffer.wrap(rcVar5.f9817c.i(64L).a());
                                                byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
                                                rcVar5.f9815a.c(vc.c(Double.longBitsToDouble(byteBufferWrap.getLong())));
                                                return Optional.empty();
                                            case 19:
                                                rc rcVar6 = (rc) obj;
                                                rcVar6.f9815a.c(vc.b(rcVar6.f9817c.h()));
                                                return Optional.empty();
                                            default:
                                                rc rcVar7 = (rc) obj;
                                                fc fcVar3 = rcVar7.f9817c;
                                                long jH = fcVar3.h();
                                                if (jH >= 0 && jH <= 2147483647L) {
                                                    if ((7 & jH) != 0) {
                                                        return Optional.of(qb.f9395g);
                                                    }
                                                    rcVar7.f9815a.c(vc.d(fcVar3.i(jH)));
                                                    return Optional.empty();
                                                }
                                                return Optional.of(qb.B);
                                        }
                                    } catch (lc unused5) {
                                        qbVar = qb.f9391c;
                                    }
                                } catch (lc e7) {
                                    e = e7;
                                    throw new AssertionError(zb.a("CEiv6BFfPnitUE+D"), e);
                                }
                            } catch (cc unused6) {
                                qbVar = qb.F;
                            }
                        } catch (tc unused7) {
                            qbVar = qb.A;
                        }
                    } catch (kc unused8) {
                        qbVar = qb.f9413z;
                    }
                } catch (ec unused9) {
                    qbVar = qb.B;
                }
            } catch (dc e10) {
                e = e10;
                throw new AssertionError(zb.a("CEiv6BFfPnitUE+D"), e);
            }
        } catch (dc | ec unused10) {
            qbVar = qb.f9398k;
        }
        return Optional.of(qbVar);
    }
}
