package yi;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.vk.api.sdk.exceptions.VKApiCodes;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends ii.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f45645a = new d();

    @Override // ii.w
    public final Object readValueOfType(byte b2, ByteBuffer byteBuffer) {
        switch (b2) {
            case -127:
                Object value = readValue(byteBuffer);
                if (value == null) {
                    return null;
                }
                return k.values()[((Long) value).intValue()];
            case -126:
                Object value2 = readValue(byteBuffer);
                if (value2 == null) {
                    return null;
                }
                return b0.values()[((Long) value2).intValue()];
            case -125:
                Object value3 = readValue(byteBuffer);
                if (value3 == null) {
                    return null;
                }
                return t.values()[((Long) value3).intValue()];
            case -124:
                Object value4 = readValue(byteBuffer);
                if (value4 == null) {
                    return null;
                }
                return g.values()[((Long) value4).intValue()];
            case -123:
                Object value5 = readValue(byteBuffer);
                if (value5 == null) {
                    return null;
                }
                return h.values()[((Long) value5).intValue()];
            case -122:
                Object value6 = readValue(byteBuffer);
                if (value6 == null) {
                    return null;
                }
                return x.values()[((Long) value6).intValue()];
            case -121:
                Object value7 = readValue(byteBuffer);
                if (value7 == null) {
                    return null;
                }
                return a0.values()[((Long) value7).intValue()];
            case -120:
                ArrayList arrayList = (ArrayList) readValue(byteBuffer);
                z zVar = new z();
                String str = (String) arrayList.get(0);
                if (str == null) {
                    throw new IllegalStateException("Nonnull field \"productId\" is null.");
                }
                zVar.f45748a = str;
                t tVar = (t) arrayList.get(1);
                if (tVar == null) {
                    throw new IllegalStateException("Nonnull field \"productType\" is null.");
                }
                zVar.f45749b = tVar;
                return zVar;
            case -119:
                ArrayList arrayList2 = (ArrayList) readValue(byteBuffer);
                e eVar = new e();
                eVar.f45649a = (String) arrayList2.get(0);
                eVar.f45650b = (String) arrayList2.get(1);
                return eVar;
            case -118:
                ArrayList arrayList3 = (ArrayList) readValue(byteBuffer);
                l lVar = new l();
                k kVar = (k) arrayList3.get(0);
                if (kVar == null) {
                    throw new IllegalStateException("Nonnull field \"responseCode\" is null.");
                }
                lVar.f45690a = kVar;
                String str2 = (String) arrayList3.get(1);
                if (str2 == null) {
                    throw new IllegalStateException("Nonnull field \"debugMessage\" is null.");
                }
                lVar.f45691b = str2;
                return lVar;
            case -117:
                ArrayList arrayList4 = (ArrayList) readValue(byteBuffer);
                n nVar = new n();
                Long l10 = (Long) arrayList4.get(0);
                if (l10 == null) {
                    throw new IllegalStateException("Nonnull field \"priceAmountMicros\" is null.");
                }
                nVar.f45694a = l10;
                String str3 = (String) arrayList4.get(1);
                if (str3 == null) {
                    throw new IllegalStateException("Nonnull field \"formattedPrice\" is null.");
                }
                nVar.f45695b = str3;
                String str4 = (String) arrayList4.get(2);
                if (str4 == null) {
                    throw new IllegalStateException("Nonnull field \"priceCurrencyCode\" is null.");
                }
                nVar.f45696c = str4;
                return nVar;
            case -116:
                ArrayList arrayList5 = (ArrayList) readValue(byteBuffer);
                r rVar = new r();
                String str5 = (String) arrayList5.get(0);
                if (str5 == null) {
                    throw new IllegalStateException("Nonnull field \"description\" is null.");
                }
                rVar.f45706a = str5;
                String str6 = (String) arrayList5.get(1);
                if (str6 == null) {
                    throw new IllegalStateException("Nonnull field \"name\" is null.");
                }
                rVar.f45707b = str6;
                String str7 = (String) arrayList5.get(2);
                if (str7 == null) {
                    throw new IllegalStateException("Nonnull field \"productId\" is null.");
                }
                rVar.f45708c = str7;
                t tVar2 = (t) arrayList5.get(3);
                if (tVar2 == null) {
                    throw new IllegalStateException("Nonnull field \"productType\" is null.");
                }
                rVar.f45709d = tVar2;
                String str8 = (String) arrayList5.get(4);
                if (str8 == null) {
                    throw new IllegalStateException("Nonnull field \"title\" is null.");
                }
                rVar.f45710e = str8;
                rVar.f45711f = (n) arrayList5.get(5);
                rVar.f45712g = (List) arrayList5.get(6);
                return rVar;
            case -115:
                ArrayList arrayList6 = (ArrayList) readValue(byteBuffer);
                s sVar = new s();
                l lVar2 = (l) arrayList6.get(0);
                if (lVar2 == null) {
                    throw new IllegalStateException("Nonnull field \"billingResult\" is null.");
                }
                sVar.f45713a = lVar2;
                List list = (List) arrayList6.get(1);
                if (list == null) {
                    throw new IllegalStateException("Nonnull field \"productDetails\" is null.");
                }
                sVar.f45714b = list;
                return sVar;
            case -114:
                ArrayList arrayList7 = (ArrayList) readValue(byteBuffer);
                f fVar = new f();
                l lVar3 = (l) arrayList7.get(0);
                if (lVar3 == null) {
                    throw new IllegalStateException("Nonnull field \"billingResult\" is null.");
                }
                fVar.f45654a = lVar3;
                String str9 = (String) arrayList7.get(1);
                if (str9 == null) {
                    throw new IllegalStateException("Nonnull field \"externalTransactionToken\" is null.");
                }
                fVar.f45655b = str9;
                return fVar;
            case -113:
                ArrayList arrayList8 = (ArrayList) readValue(byteBuffer);
                i iVar = new i();
                l lVar4 = (l) arrayList8.get(0);
                if (lVar4 == null) {
                    throw new IllegalStateException("Nonnull field \"billingResult\" is null.");
                }
                iVar.f45668a = lVar4;
                String str10 = (String) arrayList8.get(1);
                if (str10 == null) {
                    throw new IllegalStateException("Nonnull field \"countryCode\" is null.");
                }
                iVar.f45669b = str10;
                return iVar;
            case -112:
                ArrayList arrayList9 = (ArrayList) readValue(byteBuffer);
                j jVar = new j();
                String str11 = (String) arrayList9.get(0);
                if (str11 == null) {
                    throw new IllegalStateException("Nonnull field \"product\" is null.");
                }
                jVar.f45670a = str11;
                b0 b0Var = (b0) arrayList9.get(1);
                if (b0Var == null) {
                    throw new IllegalStateException("Nonnull field \"replacementMode\" is null.");
                }
                jVar.f45671b = b0Var;
                jVar.f45672c = (String) arrayList9.get(2);
                jVar.f45673d = (String) arrayList9.get(3);
                jVar.f45674e = (String) arrayList9.get(4);
                jVar.f45675f = (String) arrayList9.get(5);
                jVar.f45676g = (String) arrayList9.get(6);
                return jVar;
            case -111:
                ArrayList arrayList10 = (ArrayList) readValue(byteBuffer);
                q qVar = new q();
                Long l11 = (Long) arrayList10.get(0);
                if (l11 == null) {
                    throw new IllegalStateException("Nonnull field \"billingCycleCount\" is null.");
                }
                qVar.f45700a = l11;
                a0 a0Var = (a0) arrayList10.get(1);
                if (a0Var == null) {
                    throw new IllegalStateException("Nonnull field \"recurrenceMode\" is null.");
                }
                qVar.f45701b = a0Var;
                Long l12 = (Long) arrayList10.get(2);
                if (l12 == null) {
                    throw new IllegalStateException("Nonnull field \"priceAmountMicros\" is null.");
                }
                qVar.f45702c = l12;
                String str12 = (String) arrayList10.get(3);
                if (str12 == null) {
                    throw new IllegalStateException("Nonnull field \"billingPeriod\" is null.");
                }
                qVar.f45703d = str12;
                String str13 = (String) arrayList10.get(4);
                if (str13 == null) {
                    throw new IllegalStateException("Nonnull field \"formattedPrice\" is null.");
                }
                qVar.f45704e = str13;
                String str14 = (String) arrayList10.get(5);
                if (str14 == null) {
                    throw new IllegalStateException("Nonnull field \"priceCurrencyCode\" is null.");
                }
                qVar.f45705f = str14;
                return qVar;
            case -110:
                ArrayList arrayList11 = (ArrayList) readValue(byteBuffer);
                u uVar = new u();
                uVar.f45719a = (String) arrayList11.get(0);
                String str15 = (String) arrayList11.get(1);
                if (str15 == null) {
                    throw new IllegalStateException("Nonnull field \"packageName\" is null.");
                }
                uVar.f45720b = str15;
                Long l13 = (Long) arrayList11.get(2);
                if (l13 == null) {
                    throw new IllegalStateException("Nonnull field \"purchaseTime\" is null.");
                }
                uVar.f45721c = l13;
                String str16 = (String) arrayList11.get(3);
                if (str16 == null) {
                    throw new IllegalStateException("Nonnull field \"purchaseToken\" is null.");
                }
                uVar.f45722d = str16;
                String str17 = (String) arrayList11.get(4);
                if (str17 == null) {
                    throw new IllegalStateException("Nonnull field \"signature\" is null.");
                }
                uVar.f45723e = str17;
                List list2 = (List) arrayList11.get(5);
                if (list2 == null) {
                    throw new IllegalStateException("Nonnull field \"products\" is null.");
                }
                uVar.f45724f = list2;
                Boolean bool = (Boolean) arrayList11.get(6);
                if (bool == null) {
                    throw new IllegalStateException("Nonnull field \"isAutoRenewing\" is null.");
                }
                uVar.f45725g = bool;
                String str18 = (String) arrayList11.get(7);
                if (str18 == null) {
                    throw new IllegalStateException("Nonnull field \"originalJson\" is null.");
                }
                uVar.f45726h = str18;
                String str19 = (String) arrayList11.get(8);
                if (str19 == null) {
                    throw new IllegalStateException("Nonnull field \"developerPayload\" is null.");
                }
                uVar.i = str19;
                Boolean bool2 = (Boolean) arrayList11.get(9);
                if (bool2 == null) {
                    throw new IllegalStateException("Nonnull field \"isAcknowledged\" is null.");
                }
                uVar.f45727j = bool2;
                Long l14 = (Long) arrayList11.get(10);
                if (l14 == null) {
                    throw new IllegalStateException("Nonnull field \"quantity\" is null.");
                }
                uVar.f45728k = l14;
                x xVar = (x) arrayList11.get(11);
                if (xVar == null) {
                    throw new IllegalStateException("Nonnull field \"purchaseState\" is null.");
                }
                uVar.f45729l = xVar;
                uVar.f45730m = (e) arrayList11.get(12);
                uVar.f45731n = (o) arrayList11.get(13);
                return uVar;
            case -109:
                ArrayList arrayList12 = (ArrayList) readValue(byteBuffer);
                o oVar = new o();
                List list3 = (List) arrayList12.get(0);
                if (list3 == null) {
                    throw new IllegalStateException("Nonnull field \"products\" is null.");
                }
                oVar.f45697a = list3;
                String str20 = (String) arrayList12.get(1);
                if (str20 == null) {
                    throw new IllegalStateException("Nonnull field \"purchaseToken\" is null.");
                }
                oVar.f45698b = str20;
                return oVar;
            case -108:
                ArrayList arrayList13 = (ArrayList) readValue(byteBuffer);
                v vVar = new v();
                Long l15 = (Long) arrayList13.get(0);
                if (l15 == null) {
                    throw new IllegalStateException("Nonnull field \"quantity\" is null.");
                }
                vVar.f45732a = l15;
                Long l16 = (Long) arrayList13.get(1);
                if (l16 == null) {
                    throw new IllegalStateException("Nonnull field \"purchaseTime\" is null.");
                }
                vVar.f45733b = l16;
                vVar.f45734c = (String) arrayList13.get(2);
                String str21 = (String) arrayList13.get(3);
                if (str21 == null) {
                    throw new IllegalStateException("Nonnull field \"originalJson\" is null.");
                }
                vVar.f45735d = str21;
                String str22 = (String) arrayList13.get(4);
                if (str22 == null) {
                    throw new IllegalStateException("Nonnull field \"purchaseToken\" is null.");
                }
                vVar.f45736e = str22;
                String str23 = (String) arrayList13.get(5);
                if (str23 == null) {
                    throw new IllegalStateException("Nonnull field \"signature\" is null.");
                }
                vVar.f45737f = str23;
                List list4 = (List) arrayList13.get(6);
                if (list4 == null) {
                    throw new IllegalStateException("Nonnull field \"products\" is null.");
                }
                vVar.f45738g = list4;
                return vVar;
            case -107:
                ArrayList arrayList14 = (ArrayList) readValue(byteBuffer);
                w wVar = new w();
                l lVar5 = (l) arrayList14.get(0);
                if (lVar5 == null) {
                    throw new IllegalStateException("Nonnull field \"billingResult\" is null.");
                }
                wVar.f45739a = lVar5;
                List list5 = (List) arrayList14.get(1);
                if (list5 == null) {
                    throw new IllegalStateException("Nonnull field \"purchases\" is null.");
                }
                wVar.f45740b = list5;
                return wVar;
            case -106:
                ArrayList arrayList15 = (ArrayList) readValue(byteBuffer);
                y yVar = new y();
                l lVar6 = (l) arrayList15.get(0);
                if (lVar6 == null) {
                    throw new IllegalStateException("Nonnull field \"billingResult\" is null.");
                }
                yVar.f45746a = lVar6;
                List list6 = (List) arrayList15.get(1);
                if (list6 == null) {
                    throw new IllegalStateException("Nonnull field \"purchases\" is null.");
                }
                yVar.f45747b = list6;
                return yVar;
            case -105:
                ArrayList arrayList16 = (ArrayList) readValue(byteBuffer);
                c0 c0Var = new c0();
                String str24 = (String) arrayList16.get(0);
                if (str24 == null) {
                    throw new IllegalStateException("Nonnull field \"basePlanId\" is null.");
                }
                c0Var.f45639a = str24;
                c0Var.f45640b = (String) arrayList16.get(1);
                String str25 = (String) arrayList16.get(2);
                if (str25 == null) {
                    throw new IllegalStateException("Nonnull field \"offerToken\" is null.");
                }
                c0Var.f45641c = str25;
                List list7 = (List) arrayList16.get(3);
                if (list7 == null) {
                    throw new IllegalStateException("Nonnull field \"offerTags\" is null.");
                }
                c0Var.f45642d = list7;
                List list8 = (List) arrayList16.get(4);
                if (list8 == null) {
                    throw new IllegalStateException("Nonnull field \"pricingPhases\" is null.");
                }
                c0Var.f45643e = list8;
                c0Var.f45644f = (m) arrayList16.get(5);
                return c0Var;
            case -104:
                ArrayList arrayList17 = (ArrayList) readValue(byteBuffer);
                d0 d0Var = new d0();
                d0Var.f45646a = (String) arrayList17.get(0);
                String str26 = (String) arrayList17.get(1);
                if (str26 == null) {
                    throw new IllegalStateException("Nonnull field \"externalTransactionToken\" is null.");
                }
                d0Var.f45647b = str26;
                List list9 = (List) arrayList17.get(2);
                if (list9 == null) {
                    throw new IllegalStateException("Nonnull field \"products\" is null.");
                }
                d0Var.f45648c = list9;
                return d0Var;
            case -103:
                ArrayList arrayList18 = (ArrayList) readValue(byteBuffer);
                e0 e0Var = new e0();
                String str27 = (String) arrayList18.get(0);
                if (str27 == null) {
                    throw new IllegalStateException("Nonnull field \"id\" is null.");
                }
                e0Var.f45651a = str27;
                e0Var.f45652b = (String) arrayList18.get(1);
                t tVar3 = (t) arrayList18.get(2);
                if (tVar3 == null) {
                    throw new IllegalStateException("Nonnull field \"type\" is null.");
                }
                e0Var.f45653c = tVar3;
                return e0Var;
            case -102:
                ArrayList arrayList19 = (ArrayList) readValue(byteBuffer);
                m mVar = new m();
                Long l17 = (Long) arrayList19.get(0);
                if (l17 == null) {
                    throw new IllegalStateException("Nonnull field \"commitmentPaymentsCount\" is null.");
                }
                mVar.f45692a = l17;
                Long l18 = (Long) arrayList19.get(1);
                if (l18 == null) {
                    throw new IllegalStateException("Nonnull field \"subsequentCommitmentPaymentsCount\" is null.");
                }
                mVar.f45693b = l18;
                return mVar;
            case -101:
                ArrayList arrayList20 = (ArrayList) readValue(byteBuffer);
                p pVar = new p();
                Boolean bool3 = (Boolean) arrayList20.get(0);
                if (bool3 == null) {
                    throw new IllegalStateException("Nonnull field \"enablePrepaidPlans\" is null.");
                }
                pVar.f45699a = bool3;
                return pVar;
            default:
                return super.readValueOfType(b2, byteBuffer);
        }
    }

    @Override // ii.w
    public final void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        if (obj instanceof k) {
            byteArrayOutputStream.write(VKApiCodes.CODE_INVALID_PHOTO_FORMAT);
            writeValue(byteArrayOutputStream, Integer.valueOf(((k) obj).f45689b));
            return;
        }
        if (obj instanceof b0) {
            byteArrayOutputStream.write(130);
            writeValue(byteArrayOutputStream, Integer.valueOf(((b0) obj).f45636b));
            return;
        }
        if (obj instanceof t) {
            byteArrayOutputStream.write(131);
            writeValue(byteArrayOutputStream, Integer.valueOf(((t) obj).f45718b));
            return;
        }
        if (obj instanceof g) {
            byteArrayOutputStream.write(132);
            writeValue(byteArrayOutputStream, Integer.valueOf(((g) obj).f45659b));
            return;
        }
        if (obj instanceof h) {
            byteArrayOutputStream.write(133);
            writeValue(byteArrayOutputStream, Integer.valueOf(((h) obj).f45667b));
            return;
        }
        if (obj instanceof x) {
            byteArrayOutputStream.write(134);
            writeValue(byteArrayOutputStream, Integer.valueOf(((x) obj).f45745b));
            return;
        }
        if (obj instanceof a0) {
            byteArrayOutputStream.write(135);
            writeValue(byteArrayOutputStream, Integer.valueOf(((a0) obj).f45631b));
            return;
        }
        if (obj instanceof z) {
            byteArrayOutputStream.write(136);
            z zVar = (z) obj;
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(zVar.f45748a);
            arrayList.add(zVar.f45749b);
            writeValue(byteArrayOutputStream, arrayList);
            return;
        }
        if (obj instanceof e) {
            byteArrayOutputStream.write(137);
            e eVar = (e) obj;
            ArrayList arrayList2 = new ArrayList(2);
            arrayList2.add(eVar.f45649a);
            arrayList2.add(eVar.f45650b);
            writeValue(byteArrayOutputStream, arrayList2);
            return;
        }
        if (obj instanceof l) {
            byteArrayOutputStream.write(138);
            l lVar = (l) obj;
            ArrayList arrayList3 = new ArrayList(2);
            arrayList3.add(lVar.f45690a);
            arrayList3.add(lVar.f45691b);
            writeValue(byteArrayOutputStream, arrayList3);
            return;
        }
        if (obj instanceof n) {
            byteArrayOutputStream.write(139);
            n nVar = (n) obj;
            ArrayList arrayList4 = new ArrayList(3);
            arrayList4.add(nVar.f45694a);
            arrayList4.add(nVar.f45695b);
            arrayList4.add(nVar.f45696c);
            writeValue(byteArrayOutputStream, arrayList4);
            return;
        }
        if (obj instanceof r) {
            byteArrayOutputStream.write(140);
            r rVar = (r) obj;
            ArrayList arrayList5 = new ArrayList(7);
            arrayList5.add(rVar.f45706a);
            arrayList5.add(rVar.f45707b);
            arrayList5.add(rVar.f45708c);
            arrayList5.add(rVar.f45709d);
            arrayList5.add(rVar.f45710e);
            arrayList5.add(rVar.f45711f);
            arrayList5.add(rVar.f45712g);
            writeValue(byteArrayOutputStream, arrayList5);
            return;
        }
        if (obj instanceof s) {
            byteArrayOutputStream.write(141);
            s sVar = (s) obj;
            ArrayList arrayList6 = new ArrayList(2);
            arrayList6.add(sVar.f45713a);
            arrayList6.add(sVar.f45714b);
            writeValue(byteArrayOutputStream, arrayList6);
            return;
        }
        if (obj instanceof f) {
            byteArrayOutputStream.write(142);
            f fVar = (f) obj;
            ArrayList arrayList7 = new ArrayList(2);
            arrayList7.add(fVar.f45654a);
            arrayList7.add(fVar.f45655b);
            writeValue(byteArrayOutputStream, arrayList7);
            return;
        }
        if (obj instanceof i) {
            byteArrayOutputStream.write(143);
            i iVar = (i) obj;
            ArrayList arrayList8 = new ArrayList(2);
            arrayList8.add(iVar.f45668a);
            arrayList8.add(iVar.f45669b);
            writeValue(byteArrayOutputStream, arrayList8);
            return;
        }
        if (obj instanceof j) {
            byteArrayOutputStream.write(144);
            j jVar = (j) obj;
            ArrayList arrayList9 = new ArrayList(7);
            arrayList9.add(jVar.f45670a);
            arrayList9.add(jVar.f45671b);
            arrayList9.add(jVar.f45672c);
            arrayList9.add(jVar.f45673d);
            arrayList9.add(jVar.f45674e);
            arrayList9.add(jVar.f45675f);
            arrayList9.add(jVar.f45676g);
            writeValue(byteArrayOutputStream, arrayList9);
            return;
        }
        if (obj instanceof q) {
            byteArrayOutputStream.write(145);
            q qVar = (q) obj;
            ArrayList arrayList10 = new ArrayList(6);
            arrayList10.add(qVar.f45700a);
            arrayList10.add(qVar.f45701b);
            arrayList10.add(qVar.f45702c);
            arrayList10.add(qVar.f45703d);
            arrayList10.add(qVar.f45704e);
            arrayList10.add(qVar.f45705f);
            writeValue(byteArrayOutputStream, arrayList10);
            return;
        }
        if (obj instanceof u) {
            byteArrayOutputStream.write(146);
            u uVar = (u) obj;
            ArrayList arrayList11 = new ArrayList(14);
            arrayList11.add(uVar.f45719a);
            arrayList11.add(uVar.f45720b);
            arrayList11.add(uVar.f45721c);
            arrayList11.add(uVar.f45722d);
            arrayList11.add(uVar.f45723e);
            arrayList11.add(uVar.f45724f);
            arrayList11.add(uVar.f45725g);
            arrayList11.add(uVar.f45726h);
            arrayList11.add(uVar.i);
            arrayList11.add(uVar.f45727j);
            arrayList11.add(uVar.f45728k);
            arrayList11.add(uVar.f45729l);
            arrayList11.add(uVar.f45730m);
            arrayList11.add(uVar.f45731n);
            writeValue(byteArrayOutputStream, arrayList11);
            return;
        }
        if (obj instanceof o) {
            byteArrayOutputStream.write(147);
            o oVar = (o) obj;
            ArrayList arrayList12 = new ArrayList(2);
            arrayList12.add(oVar.f45697a);
            arrayList12.add(oVar.f45698b);
            writeValue(byteArrayOutputStream, arrayList12);
            return;
        }
        if (obj instanceof v) {
            byteArrayOutputStream.write(148);
            v vVar = (v) obj;
            ArrayList arrayList13 = new ArrayList(7);
            arrayList13.add(vVar.f45732a);
            arrayList13.add(vVar.f45733b);
            arrayList13.add(vVar.f45734c);
            arrayList13.add(vVar.f45735d);
            arrayList13.add(vVar.f45736e);
            arrayList13.add(vVar.f45737f);
            arrayList13.add(vVar.f45738g);
            writeValue(byteArrayOutputStream, arrayList13);
            return;
        }
        if (obj instanceof w) {
            byteArrayOutputStream.write(149);
            w wVar = (w) obj;
            ArrayList arrayList14 = new ArrayList(2);
            arrayList14.add(wVar.f45739a);
            arrayList14.add(wVar.f45740b);
            writeValue(byteArrayOutputStream, arrayList14);
            return;
        }
        if (obj instanceof y) {
            byteArrayOutputStream.write(VKApiCodes.CODE_INVALID_TIMESTAMP);
            y yVar = (y) obj;
            ArrayList arrayList15 = new ArrayList(2);
            arrayList15.add(yVar.f45746a);
            arrayList15.add(yVar.f45747b);
            writeValue(byteArrayOutputStream, arrayList15);
            return;
        }
        if (obj instanceof c0) {
            byteArrayOutputStream.write(151);
            c0 c0Var = (c0) obj;
            ArrayList arrayList16 = new ArrayList(6);
            arrayList16.add(c0Var.f45639a);
            arrayList16.add(c0Var.f45640b);
            arrayList16.add(c0Var.f45641c);
            arrayList16.add(c0Var.f45642d);
            arrayList16.add(c0Var.f45643e);
            arrayList16.add(c0Var.f45644f);
            writeValue(byteArrayOutputStream, arrayList16);
            return;
        }
        if (obj instanceof d0) {
            byteArrayOutputStream.write(152);
            d0 d0Var = (d0) obj;
            ArrayList arrayList17 = new ArrayList(3);
            arrayList17.add(d0Var.f45646a);
            arrayList17.add(d0Var.f45647b);
            arrayList17.add(d0Var.f45648c);
            writeValue(byteArrayOutputStream, arrayList17);
            return;
        }
        if (obj instanceof e0) {
            byteArrayOutputStream.write(153);
            e0 e0Var = (e0) obj;
            ArrayList arrayList18 = new ArrayList(3);
            arrayList18.add(e0Var.f45651a);
            arrayList18.add(e0Var.f45652b);
            arrayList18.add(e0Var.f45653c);
            writeValue(byteArrayOutputStream, arrayList18);
            return;
        }
        if (obj instanceof m) {
            byteArrayOutputStream.write(154);
            m mVar = (m) obj;
            ArrayList arrayList19 = new ArrayList(2);
            arrayList19.add(mVar.f45692a);
            arrayList19.add(mVar.f45693b);
            writeValue(byteArrayOutputStream, arrayList19);
            return;
        }
        if (!(obj instanceof p)) {
            super.writeValue(byteArrayOutputStream, obj);
            return;
        }
        byteArrayOutputStream.write(ModuleDescriptor.MODULE_VERSION);
        ArrayList arrayList20 = new ArrayList(1);
        arrayList20.add(((p) obj).f45699a);
        writeValue(byteArrayOutputStream, arrayList20);
    }
}
