package cj;

import com.vk.api.sdk.exceptions.VKApiCodes;
import fj.e1;
import fj.n0;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ni.e0;
import ni.k1;
import ni.n1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class n extends ii.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2345a;

    public /* synthetic */ n(int i) {
        this.f2345a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v47, types: [cj.p[]] */
    /* JADX WARN: Type inference failed for: r2v48, types: [cj.r[]] */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [cj.p] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [cj.r] */
    @Override // ii.w
    public Object readValueOfType(byte b2, ByteBuffer buffer) {
        Object gVar;
        Object tVar;
        ?? r62;
        switch (this.f2345a) {
            case 0:
                Intrinsics.checkNotNullParameter(buffer, "buffer");
                int i = 0;
                if (b2 == -127) {
                    Long l10 = (Long) readValue(buffer);
                    if (l10 != null) {
                        int iLongValue = (int) l10.longValue();
                        r.f2354c.getClass();
                        ?? Values = r.values();
                        int length = Values.length;
                        while (i < length) {
                            r62 = Values[i];
                            if (r62.f2356b != iLongValue) {
                                i++;
                            }
                        }
                    }
                } else if (b2 == -126) {
                    Long l11 = (Long) readValue(buffer);
                    if (l11 != null) {
                        int iLongValue2 = (int) l11.longValue();
                        p.f2347c.getClass();
                        ?? Values2 = p.values();
                        int length2 = Values2.length;
                        while (i < length2) {
                            r62 = Values2[i];
                            if (r62.f2353b != iLongValue2) {
                                i++;
                            }
                        }
                    }
                } else if (b2 == -125) {
                    Object value = readValue(buffer);
                    List pigeonVar_list = value instanceof List ? (List) value : null;
                    if (pigeonVar_list != null) {
                        Intrinsics.checkNotNullParameter(pigeonVar_list, "pigeonVar_list");
                        Object obj = pigeonVar_list.get(0);
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Long");
                        long jLongValue = ((Long) obj).longValue();
                        Object obj2 = pigeonVar_list.get(1);
                        Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                        long jLongValue2 = ((Long) obj2).longValue();
                        Object obj3 = pigeonVar_list.get(2);
                        Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                        long jLongValue3 = ((Long) obj3).longValue();
                        Object obj4 = pigeonVar_list.get(3);
                        Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                    }
                } else if (b2 == -124) {
                    Object value2 = readValue(buffer);
                    List pigeonVar_list2 = value2 instanceof List ? (List) value2 : null;
                    if (pigeonVar_list2 != null) {
                        Intrinsics.checkNotNullParameter(pigeonVar_list2, "pigeonVar_list");
                        Object obj5 = pigeonVar_list2.get(0);
                        Intrinsics.c(obj5, "null cannot be cast to non-null type io.flutter.plugins.videoplayer.PlatformPlaybackState");
                    }
                } else if (b2 == -123) {
                    Object value3 = readValue(buffer);
                    List pigeonVar_list3 = value3 instanceof List ? (List) value3 : null;
                    if (pigeonVar_list3 != null) {
                        Intrinsics.checkNotNullParameter(pigeonVar_list3, "pigeonVar_list");
                        Object obj6 = pigeonVar_list3.get(0);
                        Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                    }
                } else if (b2 == -122) {
                    Object value4 = readValue(buffer);
                    List pigeonVar_list4 = value4 instanceof List ? (List) value4 : null;
                    if (pigeonVar_list4 != null) {
                        Intrinsics.checkNotNullParameter(pigeonVar_list4, "pigeonVar_list");
                    }
                } else if (b2 == -121) {
                    Object value5 = readValue(buffer);
                    List pigeonVar_list5 = value5 instanceof List ? (List) value5 : null;
                    if (pigeonVar_list5 != null) {
                        Intrinsics.checkNotNullParameter(pigeonVar_list5, "pigeonVar_list");
                        Object obj7 = pigeonVar_list5.get(0);
                        Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.Long");
                    }
                } else if (b2 == -120) {
                    Object value6 = readValue(buffer);
                    List pigeonVar_list6 = value6 instanceof List ? (List) value6 : null;
                    if (pigeonVar_list6 != null) {
                        Intrinsics.checkNotNullParameter(pigeonVar_list6, "pigeonVar_list");
                        Object obj8 = pigeonVar_list6.get(0);
                        Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.String");
                        r rVar = (r) pigeonVar_list6.get(1);
                        Object obj9 = pigeonVar_list6.get(2);
                        Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                    }
                } else if (b2 == -119) {
                    Object value7 = readValue(buffer);
                    List pigeonVar_list7 = value7 instanceof List ? (List) value7 : null;
                    if (pigeonVar_list7 != null) {
                        Intrinsics.checkNotNullParameter(pigeonVar_list7, "pigeonVar_list");
                        Object obj10 = pigeonVar_list7.get(0);
                        Intrinsics.c(obj10, "null cannot be cast to non-null type kotlin.Long");
                        long jLongValue4 = ((Long) obj10).longValue();
                        Object obj11 = pigeonVar_list7.get(1);
                        Intrinsics.c(obj11, "null cannot be cast to non-null type kotlin.Long");
                        tVar = new w(jLongValue4, ((Long) obj11).longValue());
                    }
                } else if (b2 == -118) {
                    Object value8 = readValue(buffer);
                    List pigeonVar_list8 = value8 instanceof List ? (List) value8 : null;
                    if (pigeonVar_list8 != null) {
                        Intrinsics.checkNotNullParameter(pigeonVar_list8, "pigeonVar_list");
                        Object obj12 = pigeonVar_list8.get(0);
                        Intrinsics.c(obj12, "null cannot be cast to non-null type kotlin.Long");
                        long jLongValue5 = ((Long) obj12).longValue();
                        Object obj13 = pigeonVar_list8.get(1);
                        Intrinsics.c(obj13, "null cannot be cast to non-null type kotlin.Long");
                        tVar = new t(jLongValue5, ((Long) obj13).longValue());
                    }
                } else if (b2 == -117) {
                    Object value9 = readValue(buffer);
                    List pigeonVar_list9 = value9 instanceof List ? (List) value9 : null;
                    if (pigeonVar_list9 != null) {
                        Intrinsics.checkNotNullParameter(pigeonVar_list9, "pigeonVar_list");
                        Object obj14 = pigeonVar_list9.get(0);
                        Intrinsics.c(obj14, "null cannot be cast to non-null type kotlin.String");
                        String str = (String) obj14;
                        Object obj15 = pigeonVar_list9.get(1);
                        Intrinsics.c(obj15, "null cannot be cast to non-null type kotlin.String");
                        String str2 = (String) obj15;
                        Object obj16 = pigeonVar_list9.get(2);
                        Intrinsics.c(obj16, "null cannot be cast to non-null type kotlin.String");
                        String str3 = (String) obj16;
                        Object obj17 = pigeonVar_list9.get(3);
                        Intrinsics.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                        gVar = new e(str, str2, str3, ((Boolean) obj17).booleanValue(), (Long) pigeonVar_list9.get(4), (Long) pigeonVar_list9.get(5), (Long) pigeonVar_list9.get(6), (String) pigeonVar_list9.get(7));
                    }
                } else if (b2 == -116) {
                    Object value10 = readValue(buffer);
                    List pigeonVar_list10 = value10 instanceof List ? (List) value10 : null;
                    if (pigeonVar_list10 != null) {
                        Intrinsics.checkNotNullParameter(pigeonVar_list10, "pigeonVar_list");
                        Object obj18 = pigeonVar_list10.get(0);
                        Intrinsics.c(obj18, "null cannot be cast to non-null type kotlin.Long");
                        long jLongValue6 = ((Long) obj18).longValue();
                        Object obj19 = pigeonVar_list10.get(1);
                        Intrinsics.c(obj19, "null cannot be cast to non-null type kotlin.Long");
                        long jLongValue7 = ((Long) obj19).longValue();
                        String str4 = (String) pigeonVar_list10.get(2);
                        String str5 = (String) pigeonVar_list10.get(3);
                        Object obj20 = pigeonVar_list10.get(4);
                        Intrinsics.c(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                        gVar = new g(jLongValue6, jLongValue7, str4, str5, ((Boolean) obj20).booleanValue(), (Long) pigeonVar_list10.get(5), (Long) pigeonVar_list10.get(6), (Long) pigeonVar_list10.get(7), (String) pigeonVar_list10.get(8));
                    }
                } else if (b2 == -115) {
                    Object value11 = readValue(buffer);
                    List pigeonVar_list11 = value11 instanceof List ? (List) value11 : null;
                    if (pigeonVar_list11 != null) {
                        Intrinsics.checkNotNullParameter(pigeonVar_list11, "pigeonVar_list");
                    }
                }
                break;
            case 1:
                Intrinsics.checkNotNullParameter(buffer, "buffer");
                int i10 = 0;
                if (b2 == -127) {
                    Long l12 = (Long) readValue(buffer);
                    if (l12 != null) {
                        int iLongValue3 = (int) l12.longValue();
                        fj.r.f19405c.getClass();
                        fj.r[] rVarArrValues = fj.r.values();
                        int length3 = rVarArrValues.length;
                        while (i10 < length3) {
                            fj.r rVar2 = rVarArrValues[i10];
                            if (rVar2.f19411b != iLongValue3) {
                                i10++;
                            }
                        }
                    }
                } else if (b2 == -126) {
                    Long l13 = (Long) readValue(buffer);
                    if (l13 != null) {
                        int iLongValue4 = (int) l13.longValue();
                        fj.j.f19358c.getClass();
                        fj.j[] jVarArrValues = fj.j.values();
                        int length4 = jVarArrValues.length;
                        while (i10 < length4) {
                            fj.j jVar = jVarArrValues[i10];
                            if (jVar.f19365b != iLongValue4) {
                                i10++;
                            }
                        }
                    }
                } else if (b2 == -125) {
                    Long l14 = (Long) readValue(buffer);
                    if (l14 != null) {
                        int iLongValue5 = (int) l14.longValue();
                        fj.w.f19440c.getClass();
                        fj.w[] wVarArrValues = fj.w.values();
                        int length5 = wVarArrValues.length;
                        while (i10 < length5) {
                            fj.w wVar = wVarArrValues[i10];
                            if (wVar.f19443b != iLongValue5) {
                                i10++;
                            }
                        }
                    }
                } else if (b2 == -124) {
                    Long l15 = (Long) readValue(buffer);
                    if (l15 != null) {
                        int iLongValue6 = (int) l15.longValue();
                        n0.f19382c.getClass();
                        n0[] n0VarArrValues = n0.values();
                        int length6 = n0VarArrValues.length;
                        while (i10 < length6) {
                            n0 n0Var = n0VarArrValues[i10];
                            if (n0Var.f19390b != iLongValue6) {
                                i10++;
                            }
                        }
                    }
                } else if (b2 == -123) {
                    Long l16 = (Long) readValue(buffer);
                    if (l16 != null) {
                        int iLongValue7 = (int) l16.longValue();
                        fj.v.f19433c.getClass();
                        fj.v[] vVarArrValues = fj.v.values();
                        int length7 = vVarArrValues.length;
                        while (i10 < length7) {
                            fj.v vVar = vVarArrValues[i10];
                            if (vVar.f19435b != iLongValue7) {
                                i10++;
                            }
                        }
                    }
                    break;
                } else if (b2 == -122) {
                    Long l17 = (Long) readValue(buffer);
                    if (l17 != null) {
                        int iLongValue8 = (int) l17.longValue();
                        e1.f19341c.getClass();
                        e1[] e1VarArrValues = e1.values();
                        int length8 = e1VarArrValues.length;
                        while (i10 < length8) {
                            e1 e1Var = e1VarArrValues[i10];
                            if (e1Var.f19343b != iLongValue8) {
                                i10++;
                            }
                        }
                    }
                    break;
                }
                break;
            case 2:
                Intrinsics.checkNotNullParameter(buffer, "buffer");
                int i11 = 0;
                if (b2 == -127) {
                    Long l18 = (Long) readValue(buffer);
                    if (l18 != null) {
                        int iLongValue9 = (int) l18.longValue();
                        ni.a0.f29340c.getClass();
                        ni.a0[] a0VarArrValues = ni.a0.values();
                        int length9 = a0VarArrValues.length;
                        while (i11 < length9) {
                            ni.a0 a0Var = a0VarArrValues[i11];
                            if (a0Var.f29346b != iLongValue9) {
                                i11++;
                            }
                        }
                    }
                } else if (b2 == -126) {
                    Long l19 = (Long) readValue(buffer);
                    if (l19 != null) {
                        int iLongValue10 = (int) l19.longValue();
                        ni.d.f29364c.getClass();
                        ni.d[] dVarArrValues = ni.d.values();
                        int length10 = dVarArrValues.length;
                        while (i11 < length10) {
                            ni.d dVar = dVarArrValues[i11];
                            if (dVar.f29370b != iLongValue10) {
                                i11++;
                            }
                        }
                    }
                } else if (b2 == -125) {
                    Long l20 = (Long) readValue(buffer);
                    if (l20 != null) {
                        int iLongValue11 = (int) l20.longValue();
                        ni.o.f29457c.getClass();
                        ni.o[] oVarArrValues = ni.o.values();
                        int length11 = oVarArrValues.length;
                        while (i11 < length11) {
                            ni.o oVar = oVarArrValues[i11];
                            if (oVar.f29464b != iLongValue11) {
                                i11++;
                            }
                        }
                    }
                } else if (b2 == -124) {
                    Long l21 = (Long) readValue(buffer);
                    if (l21 != null) {
                        int iLongValue12 = (int) l21.longValue();
                        ni.d0.f29371c.getClass();
                        ni.d0[] d0VarArrValues = ni.d0.values();
                        int length12 = d0VarArrValues.length;
                        while (i11 < length12) {
                            ni.d0 d0Var = d0VarArrValues[i11];
                            if (d0Var.f29375b != iLongValue12) {
                                i11++;
                            }
                        }
                    }
                } else if (b2 == -123) {
                    Long l22 = (Long) readValue(buffer);
                    if (l22 != null) {
                        int iLongValue13 = (int) l22.longValue();
                        n1.f29454c.getClass();
                        n1[] n1VarArrValues = n1.values();
                        int length13 = n1VarArrValues.length;
                        while (i11 < length13) {
                            n1 n1Var = n1VarArrValues[i11];
                            if (n1Var.f29456b != iLongValue13) {
                                i11++;
                            }
                        }
                    }
                } else if (b2 == -122) {
                    Long l23 = (Long) readValue(buffer);
                    if (l23 != null) {
                        int iLongValue14 = (int) l23.longValue();
                        e0.f29384c.getClass();
                        e0[] e0VarArrValues = e0.values();
                        int length14 = e0VarArrValues.length;
                        while (i11 < length14) {
                            e0 e0Var = e0VarArrValues[i11];
                            if (e0Var.f29386b != iLongValue14) {
                                i11++;
                            }
                        }
                    }
                } else if (b2 == -121) {
                    Long l24 = (Long) readValue(buffer);
                    if (l24 != null) {
                        int iLongValue15 = (int) l24.longValue();
                        ni.b0.f29350c.getClass();
                        ni.b0[] b0VarArrValues = ni.b0.values();
                        int length15 = b0VarArrValues.length;
                        while (i11 < length15) {
                            ni.b0 b0Var = b0VarArrValues[i11];
                            if (b0Var.f29356b != iLongValue15) {
                                i11++;
                            }
                        }
                    }
                } else if (b2 == -120) {
                    Long l25 = (Long) readValue(buffer);
                    if (l25 != null) {
                        int iLongValue16 = (int) l25.longValue();
                        ni.q.f29473c.getClass();
                        ni.q[] qVarArrValues = ni.q.values();
                        int length16 = qVarArrValues.length;
                        while (i11 < length16) {
                            ni.q qVar = qVarArrValues[i11];
                            if (qVar.f29475b != iLongValue16) {
                                i11++;
                            }
                        }
                    }
                } else if (b2 == -119) {
                    Long l26 = (Long) readValue(buffer);
                    if (l26 != null) {
                        int iLongValue17 = (int) l26.longValue();
                        k1.f29422c.getClass();
                        k1[] k1VarArrValues = k1.values();
                        int length17 = k1VarArrValues.length;
                        while (i11 < length17) {
                            k1 k1Var = k1VarArrValues[i11];
                            if (k1Var.f29429b != iLongValue17) {
                                i11++;
                            }
                        }
                    }
                } else if (b2 == -118) {
                    Long l27 = (Long) readValue(buffer);
                    if (l27 != null) {
                        int iLongValue18 = (int) l27.longValue();
                        ni.e.f29378c.getClass();
                        ni.e[] eVarArrValues = ni.e.values();
                        int length18 = eVarArrValues.length;
                        while (i11 < length18) {
                            ni.e eVar = eVarArrValues[i11];
                            if (eVar.f29383b != iLongValue18) {
                                i11++;
                            }
                        }
                    }
                    break;
                } else if (b2 == -117) {
                    Long l28 = (Long) readValue(buffer);
                    if (l28 != null) {
                        int iLongValue19 = (int) l28.longValue();
                        ni.n.f29442c.getClass();
                        ni.n[] nVarArrValues = ni.n.values();
                        int length19 = nVarArrValues.length;
                        while (i11 < length19) {
                            ni.n nVar = nVarArrValues[i11];
                            if (nVar.f29451b != iLongValue19) {
                                i11++;
                            }
                        }
                    }
                    break;
                }
                break;
            case 3:
                Intrinsics.checkNotNullParameter(buffer, "buffer");
                if (b2 == -127) {
                    Object value12 = readValue(buffer);
                    List pigeonVar_list12 = value12 instanceof List ? (List) value12 : null;
                    if (pigeonVar_list12 != null) {
                        Intrinsics.checkNotNullParameter(pigeonVar_list12, "pigeonVar_list");
                        Object obj21 = pigeonVar_list12.get(0);
                        Intrinsics.c(obj21, "null cannot be cast to non-null type kotlin.String");
                    }
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(buffer, "buffer");
                if (b2 == -127) {
                    Object value13 = readValue(buffer);
                    List pigeonVar_list13 = value13 instanceof List ? (List) value13 : null;
                    if (pigeonVar_list13 != null) {
                        Intrinsics.checkNotNullParameter(pigeonVar_list13, "pigeonVar_list");
                        Object obj22 = pigeonVar_list13.get(0);
                        Intrinsics.c(obj22, "null cannot be cast to non-null type kotlin.Long");
                        long jLongValue8 = ((Long) obj22).longValue();
                        Object obj23 = pigeonVar_list13.get(1);
                        Intrinsics.c(obj23, "null cannot be cast to non-null type kotlin.Long");
                    }
                }
                break;
        }
        return super.readValueOfType(b2, buffer);
    }

    @Override // ii.w
    public void writeValue(ByteArrayOutputStream stream, Object obj) {
        switch (this.f2345a) {
            case 0:
                Intrinsics.checkNotNullParameter(stream, "stream");
                if (obj instanceof r) {
                    stream.write(VKApiCodes.CODE_INVALID_PHOTO_FORMAT);
                    writeValue(stream, Long.valueOf(((r) obj).f2356b));
                } else if (obj instanceof p) {
                    stream.write(130);
                    writeValue(stream, Long.valueOf(((p) obj).f2353b));
                } else if (obj instanceof j) {
                    stream.write(131);
                    writeValue(stream, ((j) obj).a());
                } else if (obj instanceof u) {
                    stream.write(132);
                    writeValue(stream, kotlin.collections.r.c(((u) obj).f2360a));
                } else if (obj instanceof k) {
                    stream.write(133);
                    writeValue(stream, kotlin.collections.r.c(Boolean.valueOf(((k) obj).f2342a)));
                } else if (obj instanceof d) {
                    stream.write(134);
                    writeValue(stream, kotlin.collections.r.c(((d) obj).f2307a));
                } else if (obj instanceof s) {
                    stream.write(135);
                    writeValue(stream, kotlin.collections.r.c(Long.valueOf(((s) obj).f2357a)));
                } else if (obj instanceof f) {
                    stream.write(136);
                    writeValue(stream, ((f) obj).a());
                } else if (obj instanceof w) {
                    stream.write(137);
                    writeValue(stream, ((w) obj).a());
                } else if (obj instanceof t) {
                    stream.write(138);
                    writeValue(stream, ((t) obj).a());
                } else if (obj instanceof e) {
                    stream.write(139);
                    writeValue(stream, ((e) obj).a());
                } else if (obj instanceof g) {
                    stream.write(140);
                    writeValue(stream, ((g) obj).a());
                } else if (!(obj instanceof o)) {
                    super.writeValue(stream, obj);
                } else {
                    stream.write(141);
                    writeValue(stream, kotlin.collections.r.c(((o) obj).f2346a));
                }
                break;
            case 1:
                Intrinsics.checkNotNullParameter(stream, "stream");
                if (obj instanceof fj.r) {
                    stream.write(VKApiCodes.CODE_INVALID_PHOTO_FORMAT);
                    writeValue(stream, Long.valueOf(((fj.r) obj).f19411b));
                } else if (obj instanceof fj.j) {
                    stream.write(130);
                    writeValue(stream, Long.valueOf(((fj.j) obj).f19365b));
                } else if (obj instanceof fj.w) {
                    stream.write(131);
                    writeValue(stream, Long.valueOf(((fj.w) obj).f19443b));
                } else if (obj instanceof n0) {
                    stream.write(132);
                    writeValue(stream, Long.valueOf(((n0) obj).f19390b));
                } else if (obj instanceof fj.v) {
                    stream.write(133);
                    writeValue(stream, Long.valueOf(((fj.v) obj).f19435b));
                } else if (!(obj instanceof e1)) {
                    super.writeValue(stream, obj);
                } else {
                    stream.write(134);
                    writeValue(stream, Long.valueOf(((e1) obj).f19343b));
                }
                break;
            case 2:
                Intrinsics.checkNotNullParameter(stream, "stream");
                if (obj instanceof ni.a0) {
                    stream.write(VKApiCodes.CODE_INVALID_PHOTO_FORMAT);
                    writeValue(stream, Long.valueOf(((ni.a0) obj).f29346b));
                } else if (obj instanceof ni.d) {
                    stream.write(130);
                    writeValue(stream, Long.valueOf(((ni.d) obj).f29370b));
                } else if (obj instanceof ni.o) {
                    stream.write(131);
                    writeValue(stream, Long.valueOf(((ni.o) obj).f29464b));
                } else if (obj instanceof ni.d0) {
                    stream.write(132);
                    writeValue(stream, Long.valueOf(((ni.d0) obj).f29375b));
                } else if (obj instanceof n1) {
                    stream.write(133);
                    writeValue(stream, Long.valueOf(((n1) obj).f29456b));
                } else if (obj instanceof e0) {
                    stream.write(134);
                    writeValue(stream, Long.valueOf(((e0) obj).f29386b));
                } else if (obj instanceof ni.b0) {
                    stream.write(135);
                    writeValue(stream, Long.valueOf(((ni.b0) obj).f29356b));
                } else if (obj instanceof ni.q) {
                    stream.write(136);
                    writeValue(stream, Long.valueOf(((ni.q) obj).f29475b));
                } else if (obj instanceof k1) {
                    stream.write(137);
                    writeValue(stream, Long.valueOf(((k1) obj).f29429b));
                } else if (obj instanceof ni.e) {
                    stream.write(138);
                    writeValue(stream, Long.valueOf(((ni.e) obj).f29383b));
                } else if (!(obj instanceof ni.n)) {
                    super.writeValue(stream, obj);
                } else {
                    stream.write(139);
                    writeValue(stream, Long.valueOf(((ni.n) obj).f29451b));
                }
                break;
            case 3:
                Intrinsics.checkNotNullParameter(stream, "stream");
                if (!(obj instanceof oi.a)) {
                    super.writeValue(stream, obj);
                } else {
                    stream.write(VKApiCodes.CODE_INVALID_PHOTO_FORMAT);
                    oi.a aVar = (oi.a) obj;
                    writeValue(stream, kotlin.collections.s.f(aVar.f30670a, aVar.f30671b));
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(stream, "stream");
                if (!(obj instanceof qi.h)) {
                    super.writeValue(stream, obj);
                } else {
                    stream.write(VKApiCodes.CODE_INVALID_PHOTO_FORMAT);
                    writeValue(stream, ((qi.h) obj).a());
                }
                break;
        }
    }
}
