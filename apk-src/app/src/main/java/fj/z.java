package fj;

import android.util.Log;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class z implements Function1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h3.e f19464c;

    public /* synthetic */ z(h3.e eVar, int i) {
        this.f19463b = i;
        this.f19464c = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List listF;
        List listF2;
        List listF3;
        List listF4;
        List listF5;
        List listF6;
        List listF7;
        List listF8;
        List listF9;
        List listF10;
        List listF11;
        List listF12;
        List listF13;
        List listF14;
        List listF15;
        List listF16;
        List listF17;
        List listF18;
        List listF19;
        List listF20;
        List listF21;
        List listF22;
        List listF23;
        List listF24;
        List listF25;
        List listF26;
        List listF27;
        List listF28;
        List listF29;
        List listF30;
        ij.m mVar = (ij.m) obj;
        switch (this.f19463b) {
            case 0:
                Throwable exception = ij.m.a(mVar.f21342b);
                h3.e eVar = this.f19464c;
                if (exception != null) {
                    Intrinsics.checkNotNullParameter(exception, "exception");
                    if (exception instanceof a) {
                        a aVar = (a) exception;
                        listF = kotlin.collections.s.f(aVar.f19299b, aVar.f19300c, aVar.f19301d);
                    } else {
                        listF = kotlin.collections.s.f(exception.getClass().getSimpleName(), exception.toString(), l7.o.k("Cause: ", exception.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception)));
                    }
                    eVar.i(listF);
                } else {
                    Object obj2 = mVar.f21342b;
                    if (obj2 instanceof ij.l) {
                        obj2 = null;
                    }
                    eVar.i(kotlin.collections.r.c((Boolean) obj2));
                }
                break;
            case 1:
                Throwable exception2 = ij.m.a(mVar.f21342b);
                h3.e eVar2 = this.f19464c;
                if (exception2 != null) {
                    Intrinsics.checkNotNullParameter(exception2, "exception");
                    if (exception2 instanceof a) {
                        a aVar2 = (a) exception2;
                        listF2 = kotlin.collections.s.f(aVar2.f19299b, aVar2.f19300c, aVar2.f19301d);
                    } else {
                        listF2 = kotlin.collections.s.f(exception2.getClass().getSimpleName(), exception2.toString(), l7.o.k("Cause: ", exception2.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception2)));
                    }
                    eVar2.i(listF2);
                } else {
                    Object obj3 = mVar.f21342b;
                    if (obj3 instanceof ij.l) {
                        obj3 = null;
                    }
                    eVar2.i(kotlin.collections.r.c((String) obj3));
                }
                break;
            case 2:
                Throwable exception3 = ij.m.a(mVar.f21342b);
                h3.e eVar3 = this.f19464c;
                if (exception3 != null) {
                    Intrinsics.checkNotNullParameter(exception3, "exception");
                    if (exception3 instanceof ni.p) {
                        ni.p pVar = (ni.p) exception3;
                        listF3 = kotlin.collections.s.f(pVar.f29468b, pVar.f29469c, pVar.f29470d);
                    } else {
                        listF3 = kotlin.collections.s.f(exception3.getClass().getSimpleName(), exception3.toString(), l7.o.k("Cause: ", exception3.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception3)));
                    }
                    eVar3.i(listF3);
                } else {
                    eVar3.i(kotlin.collections.r.c(null));
                }
                break;
            case 3:
                Throwable exception4 = ij.m.a(mVar.f21342b);
                h3.e eVar4 = this.f19464c;
                if (exception4 != null) {
                    Intrinsics.checkNotNullParameter(exception4, "exception");
                    if (exception4 instanceof ni.p) {
                        ni.p pVar2 = (ni.p) exception4;
                        listF4 = kotlin.collections.s.f(pVar2.f29468b, pVar2.f29469c, pVar2.f29470d);
                    } else {
                        listF4 = kotlin.collections.s.f(exception4.getClass().getSimpleName(), exception4.toString(), l7.o.k("Cause: ", exception4.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception4)));
                    }
                    eVar4.i(listF4);
                } else {
                    eVar4.i(kotlin.collections.r.c(null));
                }
                break;
            case 4:
                Throwable exception5 = ij.m.a(mVar.f21342b);
                h3.e eVar5 = this.f19464c;
                if (exception5 != null) {
                    Intrinsics.checkNotNullParameter(exception5, "exception");
                    if (exception5 instanceof ni.p) {
                        ni.p pVar3 = (ni.p) exception5;
                        listF5 = kotlin.collections.s.f(pVar3.f29468b, pVar3.f29469c, pVar3.f29470d);
                    } else {
                        listF5 = kotlin.collections.s.f(exception5.getClass().getSimpleName(), exception5.toString(), l7.o.k("Cause: ", exception5.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception5)));
                    }
                    eVar5.i(listF5);
                } else {
                    Object obj4 = mVar.f21342b;
                    if (obj4 instanceof ij.l) {
                        obj4 = null;
                    }
                    eVar5.i(kotlin.collections.r.c((Long) obj4));
                }
                break;
            case 5:
                Throwable exception6 = ij.m.a(mVar.f21342b);
                h3.e eVar6 = this.f19464c;
                if (exception6 != null) {
                    Intrinsics.checkNotNullParameter(exception6, "exception");
                    if (exception6 instanceof ni.p) {
                        ni.p pVar4 = (ni.p) exception6;
                        listF6 = kotlin.collections.s.f(pVar4.f29468b, pVar4.f29469c, pVar4.f29470d);
                    } else {
                        listF6 = kotlin.collections.s.f(exception6.getClass().getSimpleName(), exception6.toString(), l7.o.k("Cause: ", exception6.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception6)));
                    }
                    eVar6.i(listF6);
                } else {
                    eVar6.i(kotlin.collections.r.c(null));
                }
                break;
            case 6:
                Throwable exception7 = ij.m.a(mVar.f21342b);
                h3.e eVar7 = this.f19464c;
                if (exception7 != null) {
                    Intrinsics.checkNotNullParameter(exception7, "exception");
                    if (exception7 instanceof ni.p) {
                        ni.p pVar5 = (ni.p) exception7;
                        listF7 = kotlin.collections.s.f(pVar5.f29468b, pVar5.f29469c, pVar5.f29470d);
                    } else {
                        listF7 = kotlin.collections.s.f(exception7.getClass().getSimpleName(), exception7.toString(), l7.o.k("Cause: ", exception7.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception7)));
                    }
                    eVar7.i(listF7);
                } else {
                    eVar7.i(kotlin.collections.r.c(null));
                }
                break;
            case 7:
                Throwable exception8 = ij.m.a(mVar.f21342b);
                h3.e eVar8 = this.f19464c;
                if (exception8 != null) {
                    Intrinsics.checkNotNullParameter(exception8, "exception");
                    if (exception8 instanceof ni.p) {
                        ni.p pVar6 = (ni.p) exception8;
                        listF8 = kotlin.collections.s.f(pVar6.f29468b, pVar6.f29469c, pVar6.f29470d);
                    } else {
                        listF8 = kotlin.collections.s.f(exception8.getClass().getSimpleName(), exception8.toString(), l7.o.k("Cause: ", exception8.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception8)));
                    }
                    eVar8.i(listF8);
                } else {
                    Object obj5 = mVar.f21342b;
                    if (obj5 instanceof ij.l) {
                        obj5 = null;
                    }
                    eVar8.i(kotlin.collections.r.c((a0.m0) obj5));
                }
                break;
            case 8:
                Throwable exception9 = ij.m.a(mVar.f21342b);
                h3.e eVar9 = this.f19464c;
                if (exception9 != null) {
                    Intrinsics.checkNotNullParameter(exception9, "exception");
                    if (exception9 instanceof ni.p) {
                        ni.p pVar7 = (ni.p) exception9;
                        listF9 = kotlin.collections.s.f(pVar7.f29468b, pVar7.f29469c, pVar7.f29470d);
                    } else {
                        listF9 = kotlin.collections.s.f(exception9.getClass().getSimpleName(), exception9.toString(), l7.o.k("Cause: ", exception9.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception9)));
                    }
                    eVar9.i(listF9);
                } else {
                    Object obj6 = mVar.f21342b;
                    if (obj6 instanceof ij.l) {
                        obj6 = null;
                    }
                    eVar9.i(kotlin.collections.r.c((String) obj6));
                }
                break;
            case 9:
                Throwable exception10 = ij.m.a(mVar.f21342b);
                h3.e eVar10 = this.f19464c;
                if (exception10 != null) {
                    Intrinsics.checkNotNullParameter(exception10, "exception");
                    if (exception10 instanceof ni.p) {
                        ni.p pVar8 = (ni.p) exception10;
                        listF10 = kotlin.collections.s.f(pVar8.f29468b, pVar8.f29469c, pVar8.f29470d);
                    } else {
                        listF10 = kotlin.collections.s.f(exception10.getClass().getSimpleName(), exception10.toString(), l7.o.k("Cause: ", exception10.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception10)));
                    }
                    eVar10.i(listF10);
                } else {
                    Object obj7 = mVar.f21342b;
                    if (obj7 instanceof ij.l) {
                        obj7 = null;
                    }
                    eVar10.i(kotlin.collections.r.c((w0.f) obj7));
                }
                break;
            case 10:
                Throwable exception11 = ij.m.a(mVar.f21342b);
                h3.e eVar11 = this.f19464c;
                if (exception11 != null) {
                    Intrinsics.checkNotNullParameter(exception11, "exception");
                    if (exception11 instanceof ni.p) {
                        ni.p pVar9 = (ni.p) exception11;
                        listF11 = kotlin.collections.s.f(pVar9.f29468b, pVar9.f29469c, pVar9.f29470d);
                    } else {
                        listF11 = kotlin.collections.s.f(exception11.getClass().getSimpleName(), exception11.toString(), l7.o.k("Cause: ", exception11.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception11)));
                    }
                    eVar11.i(listF11);
                } else {
                    Object obj8 = mVar.f21342b;
                    if (obj8 instanceof ij.l) {
                        obj8 = null;
                    }
                    eVar11.i(kotlin.collections.r.c((ni.j) obj8));
                }
                break;
            case 11:
                Throwable exception12 = ij.m.a(mVar.f21342b);
                h3.e eVar12 = this.f19464c;
                if (exception12 != null) {
                    Intrinsics.checkNotNullParameter(exception12, "exception");
                    if (exception12 instanceof oi.e) {
                        oi.e eVar13 = (oi.e) exception12;
                        listF12 = kotlin.collections.s.f(eVar13.f30676b, eVar13.f30677c, null);
                    } else {
                        listF12 = kotlin.collections.s.f(exception12.getClass().getSimpleName(), exception12.toString(), l7.o.k("Cause: ", exception12.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception12)));
                    }
                    eVar12.i(listF12);
                } else {
                    Object obj9 = mVar.f21342b;
                    eVar12.i(kotlin.collections.r.c((Long) (obj9 instanceof ij.l ? null : obj9)));
                }
                break;
            case 12:
                Throwable exception13 = ij.m.a(mVar.f21342b);
                h3.e eVar14 = this.f19464c;
                if (exception13 != null) {
                    Intrinsics.checkNotNullParameter(exception13, "exception");
                    if (exception13 instanceof oi.e) {
                        oi.e eVar15 = (oi.e) exception13;
                        listF13 = kotlin.collections.s.f(eVar15.f30676b, eVar15.f30677c, null);
                    } else {
                        listF13 = kotlin.collections.s.f(exception13.getClass().getSimpleName(), exception13.toString(), l7.o.k("Cause: ", exception13.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception13)));
                    }
                    eVar14.i(listF13);
                } else {
                    eVar14.i(kotlin.collections.r.c(null));
                }
                break;
            case 13:
                Throwable exception14 = ij.m.a(mVar.f21342b);
                h3.e eVar16 = this.f19464c;
                if (exception14 != null) {
                    Intrinsics.checkNotNullParameter(exception14, "exception");
                    if (exception14 instanceof oi.e) {
                        oi.e eVar17 = (oi.e) exception14;
                        listF14 = kotlin.collections.s.f(eVar17.f30676b, eVar17.f30677c, null);
                    } else {
                        listF14 = kotlin.collections.s.f(exception14.getClass().getSimpleName(), exception14.toString(), l7.o.k("Cause: ", exception14.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception14)));
                    }
                    eVar16.i(listF14);
                } else {
                    eVar16.i(kotlin.collections.r.c(null));
                }
                break;
            case 14:
                Throwable exception15 = ij.m.a(mVar.f21342b);
                h3.e eVar18 = this.f19464c;
                if (exception15 != null) {
                    Intrinsics.checkNotNullParameter(exception15, "exception");
                    if (exception15 instanceof oi.e) {
                        oi.e eVar19 = (oi.e) exception15;
                        listF15 = kotlin.collections.s.f(eVar19.f30676b, eVar19.f30677c, null);
                    } else {
                        listF15 = kotlin.collections.s.f(exception15.getClass().getSimpleName(), exception15.toString(), l7.o.k("Cause: ", exception15.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception15)));
                    }
                    eVar18.i(listF15);
                } else {
                    eVar18.i(kotlin.collections.r.c(null));
                }
                break;
            case 15:
                Throwable exception16 = ij.m.a(mVar.f21342b);
                h3.e eVar20 = this.f19464c;
                if (exception16 != null) {
                    Intrinsics.checkNotNullParameter(exception16, "exception");
                    if (exception16 instanceof oi.e) {
                        oi.e eVar21 = (oi.e) exception16;
                        listF16 = kotlin.collections.s.f(eVar21.f30676b, eVar21.f30677c, null);
                    } else {
                        listF16 = kotlin.collections.s.f(exception16.getClass().getSimpleName(), exception16.toString(), l7.o.k("Cause: ", exception16.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception16)));
                    }
                    eVar20.i(listF16);
                } else {
                    eVar20.i(kotlin.collections.r.c(null));
                }
                break;
            case 16:
                Throwable exception17 = ij.m.a(mVar.f21342b);
                h3.e eVar22 = this.f19464c;
                if (exception17 != null) {
                    Intrinsics.checkNotNullParameter(exception17, "exception");
                    if (exception17 instanceof oi.e) {
                        oi.e eVar23 = (oi.e) exception17;
                        listF17 = kotlin.collections.s.f(eVar23.f30676b, eVar23.f30677c, null);
                    } else {
                        listF17 = kotlin.collections.s.f(exception17.getClass().getSimpleName(), exception17.toString(), l7.o.k("Cause: ", exception17.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception17)));
                    }
                    eVar22.i(listF17);
                } else {
                    eVar22.i(kotlin.collections.r.c(null));
                }
                break;
            case 17:
                Throwable exception18 = ij.m.a(mVar.f21342b);
                h3.e eVar24 = this.f19464c;
                if (exception18 != null) {
                    Intrinsics.checkNotNullParameter(exception18, "exception");
                    if (exception18 instanceof oi.e) {
                        oi.e eVar25 = (oi.e) exception18;
                        listF18 = kotlin.collections.s.f(eVar25.f30676b, eVar25.f30677c, null);
                    } else {
                        listF18 = kotlin.collections.s.f(exception18.getClass().getSimpleName(), exception18.toString(), l7.o.k("Cause: ", exception18.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception18)));
                    }
                    eVar24.i(listF18);
                } else {
                    eVar24.i(kotlin.collections.r.c(null));
                }
                break;
            case 18:
                Throwable exception19 = ij.m.a(mVar.f21342b);
                h3.e eVar26 = this.f19464c;
                if (exception19 != null) {
                    Intrinsics.checkNotNullParameter(exception19, "exception");
                    if (exception19 instanceof oi.e) {
                        oi.e eVar27 = (oi.e) exception19;
                        listF19 = kotlin.collections.s.f(eVar27.f30676b, eVar27.f30677c, null);
                    } else {
                        listF19 = kotlin.collections.s.f(exception19.getClass().getSimpleName(), exception19.toString(), l7.o.k("Cause: ", exception19.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception19)));
                    }
                    eVar26.i(listF19);
                } else {
                    eVar26.i(kotlin.collections.r.c(null));
                }
                break;
            case 19:
                Throwable exception20 = ij.m.a(mVar.f21342b);
                h3.e eVar28 = this.f19464c;
                if (exception20 != null) {
                    Intrinsics.checkNotNullParameter(exception20, "exception");
                    if (exception20 instanceof oi.e) {
                        oi.e eVar29 = (oi.e) exception20;
                        listF20 = kotlin.collections.s.f(eVar29.f30676b, eVar29.f30677c, null);
                    } else {
                        listF20 = kotlin.collections.s.f(exception20.getClass().getSimpleName(), exception20.toString(), l7.o.k("Cause: ", exception20.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception20)));
                    }
                    eVar28.i(listF20);
                } else {
                    eVar28.i(kotlin.collections.r.c(null));
                }
                break;
            case 20:
                Throwable exception21 = ij.m.a(mVar.f21342b);
                h3.e eVar30 = this.f19464c;
                if (exception21 != null) {
                    Intrinsics.checkNotNullParameter(exception21, "exception");
                    if (exception21 instanceof oi.e) {
                        oi.e eVar31 = (oi.e) exception21;
                        listF21 = kotlin.collections.s.f(eVar31.f30676b, eVar31.f30677c, null);
                    } else {
                        listF21 = kotlin.collections.s.f(exception21.getClass().getSimpleName(), exception21.toString(), l7.o.k("Cause: ", exception21.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception21)));
                    }
                    eVar30.i(listF21);
                } else {
                    Object obj10 = mVar.f21342b;
                    eVar30.i(kotlin.collections.r.c((String) (obj10 instanceof ij.l ? null : obj10)));
                }
                break;
            case 21:
                Throwable exception22 = ij.m.a(mVar.f21342b);
                h3.e eVar32 = this.f19464c;
                if (exception22 != null) {
                    Intrinsics.checkNotNullParameter(exception22, "exception");
                    if (exception22 instanceof oi.e) {
                        oi.e eVar33 = (oi.e) exception22;
                        listF22 = kotlin.collections.s.f(eVar33.f30676b, eVar33.f30677c, null);
                    } else {
                        listF22 = kotlin.collections.s.f(exception22.getClass().getSimpleName(), exception22.toString(), l7.o.k("Cause: ", exception22.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception22)));
                    }
                    eVar32.i(listF22);
                } else {
                    eVar32.i(kotlin.collections.r.c(null));
                }
                break;
            case 22:
                Throwable exception23 = ij.m.a(mVar.f21342b);
                h3.e eVar34 = this.f19464c;
                if (exception23 != null) {
                    Intrinsics.checkNotNullParameter(exception23, "exception");
                    if (exception23 instanceof oi.e) {
                        oi.e eVar35 = (oi.e) exception23;
                        listF23 = kotlin.collections.s.f(eVar35.f30676b, eVar35.f30677c, null);
                    } else {
                        listF23 = kotlin.collections.s.f(exception23.getClass().getSimpleName(), exception23.toString(), l7.o.k("Cause: ", exception23.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception23)));
                    }
                    eVar34.i(listF23);
                } else {
                    eVar34.i(kotlin.collections.r.c(null));
                }
                break;
            case 23:
                Throwable exception24 = ij.m.a(mVar.f21342b);
                h3.e eVar36 = this.f19464c;
                if (exception24 != null) {
                    Intrinsics.checkNotNullParameter(exception24, "exception");
                    if (exception24 instanceof qi.g) {
                        qi.g gVar = (qi.g) exception24;
                        listF24 = kotlin.collections.s.f(gVar.f32127b, gVar.f32128c, gVar.f32129d);
                    } else {
                        listF24 = kotlin.collections.s.f(exception24.getClass().getSimpleName(), exception24.toString(), l7.o.k("Cause: ", exception24.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception24)));
                    }
                    eVar36.i(listF24);
                } else {
                    Object obj11 = mVar.f21342b;
                    if (obj11 instanceof ij.l) {
                        obj11 = null;
                    }
                    eVar36.i(kotlin.collections.r.c((Boolean) obj11));
                }
                break;
            case 24:
                Throwable exception25 = ij.m.a(mVar.f21342b);
                h3.e eVar37 = this.f19464c;
                if (exception25 != null) {
                    Intrinsics.checkNotNullParameter(exception25, "exception");
                    if (exception25 instanceof qi.g) {
                        qi.g gVar2 = (qi.g) exception25;
                        listF25 = kotlin.collections.s.f(gVar2.f32127b, gVar2.f32128c, gVar2.f32129d);
                    } else {
                        listF25 = kotlin.collections.s.f(exception25.getClass().getSimpleName(), exception25.toString(), l7.o.k("Cause: ", exception25.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception25)));
                    }
                    eVar37.i(listF25);
                } else {
                    eVar37.i(kotlin.collections.r.c(null));
                }
                break;
            case 25:
                Throwable exception26 = ij.m.a(mVar.f21342b);
                h3.e eVar38 = this.f19464c;
                if (exception26 != null) {
                    Intrinsics.checkNotNullParameter(exception26, "exception");
                    if (exception26 instanceof qi.g) {
                        qi.g gVar3 = (qi.g) exception26;
                        listF26 = kotlin.collections.s.f(gVar3.f32127b, gVar3.f32128c, gVar3.f32129d);
                    } else {
                        listF26 = kotlin.collections.s.f(exception26.getClass().getSimpleName(), exception26.toString(), l7.o.k("Cause: ", exception26.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception26)));
                    }
                    eVar38.i(listF26);
                } else {
                    Object obj12 = mVar.f21342b;
                    if (obj12 instanceof ij.l) {
                        obj12 = null;
                    }
                    eVar38.i(kotlin.collections.r.c((Boolean) obj12));
                }
                break;
            case 26:
                Throwable exception27 = ij.m.a(mVar.f21342b);
                h3.e eVar39 = this.f19464c;
                if (exception27 != null) {
                    Intrinsics.checkNotNullParameter(exception27, "exception");
                    if (exception27 instanceof qi.g) {
                        qi.g gVar4 = (qi.g) exception27;
                        listF27 = kotlin.collections.s.f(gVar4.f32127b, gVar4.f32128c, gVar4.f32129d);
                    } else {
                        listF27 = kotlin.collections.s.f(exception27.getClass().getSimpleName(), exception27.toString(), l7.o.k("Cause: ", exception27.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception27)));
                    }
                    eVar39.i(listF27);
                } else {
                    Object obj13 = mVar.f21342b;
                    if (obj13 instanceof ij.l) {
                        obj13 = null;
                    }
                    eVar39.i(kotlin.collections.r.c((Map) obj13));
                }
                break;
            case 27:
                Throwable exception28 = ij.m.a(mVar.f21342b);
                h3.e eVar40 = this.f19464c;
                if (exception28 != null) {
                    Intrinsics.checkNotNullParameter(exception28, "exception");
                    if (exception28 instanceof qi.g) {
                        qi.g gVar5 = (qi.g) exception28;
                        listF28 = kotlin.collections.s.f(gVar5.f32127b, gVar5.f32128c, gVar5.f32129d);
                    } else {
                        listF28 = kotlin.collections.s.f(exception28.getClass().getSimpleName(), exception28.toString(), l7.o.k("Cause: ", exception28.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception28)));
                    }
                    eVar40.i(listF28);
                } else {
                    eVar40.i(kotlin.collections.r.c(null));
                }
                break;
            case 28:
                Throwable exception29 = ij.m.a(mVar.f21342b);
                h3.e eVar41 = this.f19464c;
                if (exception29 != null) {
                    Intrinsics.checkNotNullParameter(exception29, "exception");
                    if (exception29 instanceof qi.g) {
                        qi.g gVar6 = (qi.g) exception29;
                        listF29 = kotlin.collections.s.f(gVar6.f32127b, gVar6.f32128c, gVar6.f32129d);
                    } else {
                        listF29 = kotlin.collections.s.f(exception29.getClass().getSimpleName(), exception29.toString(), l7.o.k("Cause: ", exception29.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception29)));
                    }
                    eVar41.i(listF29);
                } else {
                    eVar41.i(kotlin.collections.r.c(null));
                }
                break;
            default:
                Throwable exception30 = ij.m.a(mVar.f21342b);
                h3.e eVar42 = this.f19464c;
                if (exception30 != null) {
                    Intrinsics.checkNotNullParameter(exception30, "exception");
                    if (exception30 instanceof qi.g) {
                        qi.g gVar7 = (qi.g) exception30;
                        listF30 = kotlin.collections.s.f(gVar7.f32127b, gVar7.f32128c, gVar7.f32129d);
                    } else {
                        listF30 = kotlin.collections.s.f(exception30.getClass().getSimpleName(), exception30.toString(), l7.o.k("Cause: ", exception30.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception30)));
                    }
                    eVar42.i(listF30);
                } else {
                    Object obj14 = mVar.f21342b;
                    if (obj14 instanceof ij.l) {
                        obj14 = null;
                    }
                    eVar42.i(kotlin.collections.r.c((Map) obj14));
                }
                break;
        }
        return Unit.f27471a;
    }
}
