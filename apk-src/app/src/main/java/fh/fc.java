package fh;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import io.appmetrica.analytics.impl.A2;
import io.sentry.protocol.SentryThread;
import io.sentry.protocol.ViewHierarchyNode;
import io.sentry.rrweb.RRWebVideoEvent;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class fc implements Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sy f17195b;

    public /* synthetic */ fc(sy syVar, int i) {
        this.f17194a = i;
        this.f17195b = syVar;
    }

    private final Object a(ParsingContext parsingContext, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        boolean zA = Intrinsics.a(string, "fixed");
        sy syVar = this.f17195b;
        if (zA) {
            ((ul) syVar.X5.getValue()).getClass();
            ul.a(parsingContext, jSONObject);
            return new ol();
        }
        if (Intrinsics.a(string, "relative")) {
            ((im) syVar.f18371d6.getValue()).getClass();
            JsonExpressionParser.readExpression(parsingContext, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE);
            return new ol();
        }
        EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(string, jSONObject);
        sl slVar = orThrow instanceof sl ? (sl) orThrow : null;
        if (slVar != null) {
            return ((pl) syVar.W5.getValue()).resolve(parsingContext, slVar, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    private final Object b(ParsingContext parsingContext, Object obj) {
        Object rlVar;
        JsonTemplate jsonTemplate;
        Object obj2;
        JSONObject jSONObject = (JSONObject) obj;
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate entityTemplate = parsingContext.getTemplates().get(string);
        Object obj3 = null;
        sl slVar = entityTemplate instanceof sl ? (sl) entityTemplate : null;
        if (slVar != null) {
            if (slVar instanceof ql) {
                string = "fixed";
            } else {
                if (!(slVar instanceof rl)) {
                    throw new ij.j();
                }
                string = "relative";
            }
        }
        boolean zA = Intrinsics.a(string, "fixed");
        sy syVar = this.f17195b;
        if (zA) {
            vl vlVar = (vl) syVar.Y5.getValue();
            if (slVar != null) {
                if (slVar instanceof ql) {
                    obj2 = ((ql) slVar).f18193a;
                } else {
                    if (!(slVar instanceof rl)) {
                        throw new ij.j();
                    }
                    obj2 = ((rl) slVar).f18249a;
                }
                obj3 = obj2;
            }
            vlVar.getClass();
            rlVar = new ql(vl.a(parsingContext, (yl) obj3, jSONObject));
        } else {
            if (!Intrinsics.a(string, "relative")) {
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
            }
            jm jmVar = (jm) syVar.f18382e6.getValue();
            if (slVar == null) {
                jsonTemplate = null;
            } else if (slVar instanceof ql) {
                jsonTemplate = ((ql) slVar).f18193a;
            } else {
                if (!(slVar instanceof rl)) {
                    throw new ij.j();
                }
                jsonTemplate = ((rl) slVar).f18249a;
            }
            lm lmVar = (lm) jsonTemplate;
            jmVar.getClass();
            Field field = null;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            if (lmVar != null) {
                field = lmVar.f17722a;
            }
            rlVar = new rl(new lm(JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "value", typeHelper, allowPropertyOverride, field, ParsingConvertersKt.NUMBER_TO_DOUBLE)));
        }
        return rlVar;
    }

    private final Object c(ParsingContext parsingContext, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        boolean zA = Intrinsics.a(string, "fixed");
        sy syVar = this.f17195b;
        if (zA) {
            ((dd) syVar.f18554v3.getValue()).getClass();
            dd.a(parsingContext, jSONObject);
            return new dm();
        }
        if (Intrinsics.a(string, "relative")) {
            ((nm) syVar.f18404g6.getValue()).getClass();
            nm.a(parsingContext, jSONObject);
            return new dm();
        }
        EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(string, jSONObject);
        hm hmVar = orThrow instanceof hm ? (hm) orThrow : null;
        if (hmVar != null) {
            return ((em) syVar.f18361c6.getValue()).resolve(parsingContext, hmVar, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    private final Object d(ParsingContext parsingContext, Object obj) {
        Object gmVar;
        Object obj2;
        Object obj3;
        JSONObject jSONObject = (JSONObject) obj;
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate entityTemplate = parsingContext.getTemplates().get(string);
        Object obj4 = null;
        hm hmVar = entityTemplate instanceof hm ? (hm) entityTemplate : null;
        if (hmVar != null) {
            if (hmVar instanceof fm) {
                string = "fixed";
            } else {
                if (!(hmVar instanceof gm)) {
                    throw new ij.j();
                }
                string = "relative";
            }
        }
        boolean zA = Intrinsics.a(string, "fixed");
        sy syVar = this.f17195b;
        if (zA) {
            ed edVar = (ed) syVar.f18564w3.getValue();
            if (hmVar != null) {
                if (hmVar instanceof fm) {
                    obj3 = ((fm) hmVar).f17218a;
                } else {
                    if (!(hmVar instanceof gm)) {
                        throw new ij.j();
                    }
                    obj3 = ((gm) hmVar).f17298a;
                }
                obj4 = obj3;
            }
            edVar.getClass();
            gmVar = new fm(ed.a(parsingContext, (hd) obj4, jSONObject));
        } else {
            if (!Intrinsics.a(string, "relative")) {
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
            }
            om omVar = (om) syVar.f18415h6.getValue();
            if (hmVar != null) {
                if (hmVar instanceof fm) {
                    obj2 = ((fm) hmVar).f17218a;
                } else {
                    if (!(hmVar instanceof gm)) {
                        throw new ij.j();
                    }
                    obj2 = ((gm) hmVar).f17298a;
                }
                obj4 = obj2;
            }
            omVar.getClass();
            gmVar = new gm(om.a(parsingContext, (rm) obj4, jSONObject));
        }
        return gmVar;
    }

    private final Object e(ParsingContext parsingContext, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, ViewHierarchyNode.JsonKeys.ALPHA, TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE, zn.f19278d, zn.f19275a);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "blur", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, zn.f19279e, zn.f19276b);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT, zn.f19277c);
        return new yn();
    }

    private final Object f(ParsingContext parsingContext, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        boolean zA = Intrinsics.a(string, "rounded_rectangle");
        sy syVar = this.f17195b;
        if (zA) {
            ((vm) syVar.p6.getValue()).deserialize(parsingContext, jSONObject);
            return new bo();
        }
        if (Intrinsics.a(string, "circle")) {
            ((x8) syVar.X1.getValue()).deserialize(parsingContext, jSONObject);
            return new bo();
        }
        EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(string, jSONObject);
        ko koVar = orThrow instanceof ko ? (ko) orThrow : null;
        if (koVar != null) {
            return ((ho) syVar.P6.getValue()).resolve(parsingContext, koVar, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    private final Object g(ParsingContext parsingContext, Object obj) {
        Object ioVar;
        Object obj2;
        Object obj3;
        JSONObject jSONObject = (JSONObject) obj;
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate entityTemplate = parsingContext.getTemplates().get(string);
        Object obj4 = null;
        ko koVar = entityTemplate instanceof ko ? (ko) entityTemplate : null;
        if (koVar != null) {
            if (koVar instanceof jo) {
                string = "rounded_rectangle";
            } else {
                if (!(koVar instanceof io)) {
                    throw new ij.j();
                }
                string = "circle";
            }
        }
        boolean zA = Intrinsics.a(string, "rounded_rectangle");
        sy syVar = this.f17195b;
        if (zA) {
            wm wmVar = (wm) syVar.f18506q6.getValue();
            if (koVar != null) {
                if (koVar instanceof jo) {
                    obj3 = ((jo) koVar).f17495a;
                } else {
                    if (!(koVar instanceof io)) {
                        throw new ij.j();
                    }
                    obj3 = ((io) koVar).f17396a;
                }
                obj4 = obj3;
            }
            ioVar = new jo(wmVar.deserialize(parsingContext, (zm) obj4, jSONObject));
        } else {
            if (!Intrinsics.a(string, "circle")) {
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
            }
            y8 y8Var = (y8) syVar.Y1.getValue();
            if (koVar != null) {
                if (koVar instanceof jo) {
                    obj2 = ((jo) koVar).f17495a;
                } else {
                    if (!(koVar instanceof io)) {
                        throw new ij.j();
                    }
                    obj2 = ((io) koVar).f17396a;
                }
                obj4 = obj2;
            }
            ioVar = new io(y8Var.deserialize(parsingContext, (b9) obj4, jSONObject));
        }
        return ioVar;
    }

    private final Object h(ParsingContext parsingContext, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        int iHashCode = string.hashCode();
        sy syVar = this.f17195b;
        if (iHashCode != 97445748) {
            if (iHashCode != 343327108) {
                if (iHashCode == 1386124388 && string.equals("match_parent")) {
                    ((fi) syVar.S4.getValue()).deserialize(parsingContext, jSONObject);
                    return new lo();
                }
            } else if (string.equals("wrap_content")) {
                ((cx) syVar.f18500p9.getValue()).deserialize(parsingContext, jSONObject);
                return new lo();
            }
        } else if (string.equals("fixed")) {
            ((dd) syVar.f18554v3.getValue()).getClass();
            dd.a(parsingContext, jSONObject);
            return new lo();
        }
        EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(string, jSONObject);
        qo qoVar = orThrow instanceof qo ? (qo) orThrow : null;
        if (qoVar != null) {
            return ((mo) syVar.V6.getValue()).resolve(parsingContext, qoVar, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.yandex.div.serialization.Deserializer
    public final Object deserialize(ParsingContext parsingContext, Object obj) {
        Object mcVar;
        Object obj2;
        Object obj3;
        Object ffVar;
        Object obj4;
        Object obj5;
        Object jgVar;
        Object obj6;
        Object obj7;
        Object vgVar;
        Object qhVar;
        Object obj8;
        Object obj9;
        Object tjVar;
        Object obj10;
        Object obj11;
        Object ikVar;
        Object jlVar;
        Object obj12;
        Object obj13;
        Object noVar;
        switch (this.f17194a) {
            case 0:
                JSONObject jSONObject = (JSONObject) obj;
                String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
                EntityTemplate entityTemplate = parsingContext.getTemplates().get(string);
                Object obj14 = null;
                nc ncVar = entityTemplate instanceof nc ? (nc) entityTemplate : null;
                if (ncVar != null) {
                    if (ncVar instanceof lc) {
                        string = "blur";
                    } else {
                        if (!(ncVar instanceof mc)) {
                            throw new ij.j();
                        }
                        string = "rtl_mirror";
                    }
                }
                boolean zA = Intrinsics.a(string, "blur");
                sy syVar = this.f17195b;
                if (zA) {
                    b8 b8Var = (b8) syVar.J1.getValue();
                    if (ncVar != null) {
                        if (ncVar instanceof lc) {
                            obj3 = ((lc) ncVar).f17685a;
                        } else {
                            if (!(ncVar instanceof mc)) {
                                throw new ij.j();
                            }
                            obj3 = ((mc) ncVar).f17800a;
                        }
                        obj14 = obj3;
                    }
                    b8Var.getClass();
                    mcVar = new lc(b8.a(parsingContext, (d8) obj14, jSONObject));
                } else {
                    if (!Intrinsics.a(string, "rtl_mirror")) {
                        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
                    }
                    ic icVar = (ic) syVar.f18412h3.getValue();
                    if (ncVar != null) {
                        if (ncVar instanceof lc) {
                            obj2 = ((lc) ncVar).f17685a;
                        } else {
                            if (!(ncVar instanceof mc)) {
                                throw new ij.j();
                            }
                            obj2 = ((mc) ncVar).f17800a;
                        }
                        obj14 = obj2;
                    }
                    icVar.getClass();
                    mcVar = new mc(new kc());
                }
                return mcVar;
            case 1:
                JSONObject jSONObject2 = (JSONObject) obj;
                sy syVar2 = this.f17195b;
                JsonPropertyParser.readOptionalList(parsingContext, jSONObject2, A2.f22054g, syVar2.F1);
                ij.p pVar = syVar2.f18443k1;
                JsonPropertyParser.readOptionalList(parsingContext, jSONObject2, "on_blur", pVar);
                JsonPropertyParser.readOptionalList(parsingContext, jSONObject2, "on_focus", pVar);
                return new jd();
            case 2:
                JSONObject jSONObject3 = (JSONObject) obj;
                JsonPropertyParser.readList(parsingContext, jSONObject3, "arguments", this.f17195b.E3);
                return new wd.d();
            case 3:
                JSONObject jSONObject4 = (JSONObject) obj;
                String string2 = JsonPropertyParser.readString(parsingContext, jSONObject4, "type");
                boolean zA2 = Intrinsics.a(string2, "default");
                sy syVar3 = this.f17195b;
                if (zA2) {
                    ((db) syVar3.I2.getValue()).deserialize(parsingContext, jSONObject4);
                    return new cf();
                }
                if (Intrinsics.a(string2, "stretch")) {
                    ((aq) syVar3.f18518r7.getValue()).deserialize(parsingContext, jSONObject4);
                    return new cf();
                }
                EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(string2, jSONObject4);
                gf gfVar = orThrow instanceof gf ? (gf) orThrow : null;
                if (gfVar != null) {
                    return ((df) syVar3.f18347b4.getValue()).resolve(parsingContext, gfVar, jSONObject4);
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject4, "type", string2);
            case 4:
                JSONObject jSONObject5 = (JSONObject) obj;
                String string3 = JsonPropertyParser.readString(parsingContext, jSONObject5, "type");
                EntityTemplate entityTemplate2 = parsingContext.getTemplates().get(string3);
                Object obj15 = null;
                gf gfVar2 = entityTemplate2 instanceof gf ? (gf) entityTemplate2 : null;
                if (gfVar2 != null) {
                    if (gfVar2 instanceof ef) {
                        string3 = "default";
                    } else {
                        if (!(gfVar2 instanceof ff)) {
                            throw new ij.j();
                        }
                        string3 = "stretch";
                    }
                }
                boolean zA3 = Intrinsics.a(string3, "default");
                sy syVar4 = this.f17195b;
                if (zA3) {
                    eb ebVar = (eb) syVar4.J2.getValue();
                    if (gfVar2 == null) {
                        obj5 = null;
                    } else if (gfVar2 instanceof ef) {
                        obj5 = ((ef) gfVar2).f17146a;
                    } else {
                        if (!(gfVar2 instanceof ff)) {
                            throw new ij.j();
                        }
                        obj5 = ((ff) gfVar2).f17215a;
                    }
                    hb hbVar = (hb) obj5;
                    ebVar.getClass();
                    ffVar = new ef(new hb(JsonFieldParser.readOptionalField(ParsingContextKt.restrictPropertyOverride(parsingContext), jSONObject5, "space_between_centers", parsingContext.getAllowPropertyOverride(), hbVar != null ? hbVar.f17334a : null, ebVar.f17144a.f18564w3)));
                } else {
                    if (!Intrinsics.a(string3, "stretch")) {
                        throw ParsingExceptionKt.typeMismatch(jSONObject5, "type", string3);
                    }
                    bq bqVar = (bq) syVar4.f18528s7.getValue();
                    if (gfVar2 != null) {
                        if (gfVar2 instanceof ef) {
                            obj4 = ((ef) gfVar2).f17146a;
                        } else {
                            if (!(gfVar2 instanceof ff)) {
                                throw new ij.j();
                            }
                            obj4 = ((ff) gfVar2).f17215a;
                        }
                        obj15 = obj4;
                    }
                    ffVar = new ff(bqVar.deserialize(parsingContext, (eq) obj15, jSONObject5));
                }
                return ffVar;
            case 5:
                JSONObject jSONObject6 = (JSONObject) obj;
                String string4 = JsonPropertyParser.readString(parsingContext, jSONObject6, "type");
                boolean zA4 = Intrinsics.a(string4, "regex");
                sy syVar5 = this.f17195b;
                if (zA4) {
                    ((fg) syVar5.f18456l4.getValue()).getClass();
                    JsonExpressionParser.readExpression(parsingContext, jSONObject6, "pattern", TypeHelpersKt.TYPE_HELPER_STRING);
                    return new yf();
                }
                if (Intrinsics.a(string4, "expression")) {
                    ((ag) syVar5.f18424i4.getValue()).getClass();
                    JsonExpressionParser.readExpression(parsingContext, jSONObject6, "condition", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN);
                    return new yf();
                }
                EntityTemplate orThrow2 = parsingContext.getTemplates().getOrThrow(string4, jSONObject6);
                lg lgVar = orThrow2 instanceof lg ? (lg) orThrow2 : null;
                if (lgVar != null) {
                    return ((eg) syVar5.f18505q4.getValue()).resolve(parsingContext, lgVar, jSONObject6);
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject6, "type", string4);
            case 6:
                JSONObject jSONObject7 = (JSONObject) obj;
                String string5 = JsonPropertyParser.readString(parsingContext, jSONObject7, "type");
                EntityTemplate entityTemplate3 = parsingContext.getTemplates().get(string5);
                lg lgVar2 = entityTemplate3 instanceof lg ? (lg) entityTemplate3 : null;
                if (lgVar2 != null) {
                    if (lgVar2 instanceof kg) {
                        string5 = "regex";
                    } else {
                        if (!(lgVar2 instanceof jg)) {
                            throw new ij.j();
                        }
                        string5 = "expression";
                    }
                }
                boolean zA5 = Intrinsics.a(string5, "regex");
                sy syVar6 = this.f17195b;
                if (zA5) {
                    gg ggVar = (gg) syVar6.f18467m4.getValue();
                    if (lgVar2 == null) {
                        obj7 = null;
                    } else if (lgVar2 instanceof kg) {
                        obj7 = ((kg) lgVar2).f17580a;
                    } else {
                        if (!(lgVar2 instanceof jg)) {
                            throw new ij.j();
                        }
                        obj7 = ((jg) lgVar2).f17490a;
                    }
                    ig igVar = (ig) obj7;
                    ggVar.getClass();
                    Field field = null;
                    boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
                    ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
                    TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
                    if (igVar != null) {
                        field = igVar.f17385a;
                    }
                    jgVar = new kg(new ig(JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject7, "pattern", typeHelper, allowPropertyOverride, field)));
                } else {
                    Field field2 = null;
                    if (!Intrinsics.a(string5, "expression")) {
                        throw ParsingExceptionKt.typeMismatch(jSONObject7, "type", string5);
                    }
                    bg bgVar = (bg) syVar6.f18435j4.getValue();
                    if (lgVar2 == null) {
                        obj6 = null;
                    } else if (lgVar2 instanceof kg) {
                        obj6 = ((kg) lgVar2).f17580a;
                    } else {
                        if (!(lgVar2 instanceof jg)) {
                            throw new ij.j();
                        }
                        obj6 = ((jg) lgVar2).f17490a;
                    }
                    dg dgVar = (dg) obj6;
                    bgVar.getClass();
                    boolean allowPropertyOverride2 = parsingContext.getAllowPropertyOverride();
                    ParsingContext parsingContextRestrictPropertyOverride2 = ParsingContextKt.restrictPropertyOverride(parsingContext);
                    TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
                    if (dgVar != null) {
                        field2 = dgVar.f17090a;
                    }
                    jgVar = new jg(new dg(JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride2, jSONObject7, "condition", typeHelper2, allowPropertyOverride2, field2, ParsingConvertersKt.ANY_TO_BOOLEAN)));
                }
                return jgVar;
            case 7:
                JSONObject jSONObject8 = (JSONObject) obj;
                String string6 = JsonPropertyParser.readString(parsingContext, jSONObject8, "type");
                int iHashCode = string6.hashCode();
                sy syVar7 = this.f17195b;
                if (iHashCode != 106642798) {
                    if (iHashCode != 393594385) {
                        if (iHashCode == 575402001 && string6.equals("currency")) {
                            ((na) syVar7.f18584y2.getValue()).getClass();
                            na.a(parsingContext, jSONObject8);
                            return new rg();
                        }
                    } else if (string6.equals("fixed_length")) {
                        ((vc) syVar7.f18495p3.getValue()).deserialize(parsingContext, jSONObject8);
                        return new rg();
                    }
                } else if (string6.equals("phone")) {
                    ((sk) syVar7.F5.getValue()).getClass();
                    return new rg();
                }
                EntityTemplate orThrow3 = parsingContext.getTemplates().getOrThrow(string6, jSONObject8);
                wg wgVar = orThrow3 instanceof wg ? (wg) orThrow3 : null;
                if (wgVar != null) {
                    return ((sg) syVar7.f18536t4.getValue()).resolve(parsingContext, wgVar, jSONObject8);
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject8, "type", string6);
            case 8:
                JSONObject jSONObject9 = (JSONObject) obj;
                String string7 = JsonPropertyParser.readString(parsingContext, jSONObject9, "type");
                EntityTemplate entityTemplate4 = parsingContext.getTemplates().get(string7);
                wg wgVar2 = entityTemplate4 instanceof wg ? (wg) entityTemplate4 : null;
                if (wgVar2 != null) {
                    if (wgVar2 instanceof ug) {
                        string7 = "fixed_length";
                    } else if (wgVar2 instanceof tg) {
                        string7 = "currency";
                    } else {
                        if (!(wgVar2 instanceof vg)) {
                            throw new ij.j();
                        }
                        string7 = "phone";
                    }
                }
                int iHashCode2 = string7.hashCode();
                sy syVar8 = this.f17195b;
                if (iHashCode2 == 106642798) {
                    if (string7.equals("phone")) {
                        tk tkVar = (tk) syVar8.G5.getValue();
                        vk vkVar = (vk) (wgVar2 != null ? wgVar2.a() : null);
                        tkVar.getClass();
                        vgVar = new vg(new vk(JsonFieldParser.readField(ParsingContextKt.restrictPropertyOverride(parsingContext), jSONObject9, "raw_text_variable", parsingContext.getAllowPropertyOverride(), vkVar != null ? vkVar.f18784a : null)));
                        return vgVar;
                    }
                    throw ParsingExceptionKt.typeMismatch(jSONObject9, "type", string7);
                }
                if (iHashCode2 == 393594385) {
                    if (string7.equals("fixed_length")) {
                        vgVar = new ug(((wc) syVar8.f18504q3.getValue()).deserialize(parsingContext, (bd) (wgVar2 != null ? wgVar2.a() : null), jSONObject9));
                        return vgVar;
                    }
                    throw ParsingExceptionKt.typeMismatch(jSONObject9, "type", string7);
                }
                if (iHashCode2 == 575402001 && string7.equals("currency")) {
                    oa oaVar = (oa) syVar8.f18593z2.getValue();
                    Object objA = wgVar2 != null ? wgVar2.a() : null;
                    oaVar.getClass();
                    vgVar = new tg(oa.a(parsingContext, (qa) objA, jSONObject9));
                    return vgVar;
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject9, "type", string7);
            case 9:
                JSONObject jSONObject10 = (JSONObject) obj;
                String string8 = JsonPropertyParser.readString(parsingContext, jSONObject10, "type");
                boolean zA6 = Intrinsics.a(string8, "regex");
                sy syVar9 = this.f17195b;
                if (zA6) {
                    ((lh) syVar9.f18576x4.getValue()).getClass();
                    lh.a(parsingContext, jSONObject10);
                    return new zg();
                }
                if (Intrinsics.a(string8, "expression")) {
                    ((eh) syVar9.u4.getValue()).getClass();
                    eh.a(parsingContext, jSONObject10);
                    return new zg();
                }
                EntityTemplate orThrow4 = parsingContext.getTemplates().getOrThrow(string8, jSONObject10);
                sh shVar = orThrow4 instanceof sh ? (sh) orThrow4 : null;
                if (shVar != null) {
                    return ((jh) syVar9.C4.getValue()).resolve(parsingContext, shVar, jSONObject10);
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject10, "type", string8);
            case 10:
                JSONObject jSONObject11 = (JSONObject) obj;
                String string9 = JsonPropertyParser.readString(parsingContext, jSONObject11, "type");
                EntityTemplate entityTemplate5 = parsingContext.getTemplates().get(string9);
                Object obj16 = null;
                sh shVar2 = entityTemplate5 instanceof sh ? (sh) entityTemplate5 : null;
                if (shVar2 != null) {
                    if (shVar2 instanceof rh) {
                        string9 = "regex";
                    } else {
                        if (!(shVar2 instanceof qh)) {
                            throw new ij.j();
                        }
                        string9 = "expression";
                    }
                }
                boolean zA7 = Intrinsics.a(string9, "regex");
                sy syVar10 = this.f17195b;
                if (zA7) {
                    mh mhVar = (mh) syVar10.f18586y4.getValue();
                    if (shVar2 != null) {
                        if (shVar2 instanceof rh) {
                            obj9 = ((rh) shVar2).f18238a;
                        } else {
                            if (!(shVar2 instanceof qh)) {
                                throw new ij.j();
                            }
                            obj9 = ((qh) shVar2).f18190a;
                        }
                        obj16 = obj9;
                    }
                    mhVar.getClass();
                    qhVar = new rh(mh.a(parsingContext, (ph) obj16, jSONObject11));
                } else {
                    if (!Intrinsics.a(string9, "expression")) {
                        throw ParsingExceptionKt.typeMismatch(jSONObject11, "type", string9);
                    }
                    fh fhVar = (fh) syVar10.f18555v4.getValue();
                    if (shVar2 != null) {
                        if (shVar2 instanceof rh) {
                            obj8 = ((rh) shVar2).f18238a;
                        } else {
                            if (!(shVar2 instanceof qh)) {
                                throw new ij.j();
                            }
                            obj8 = ((qh) shVar2).f18190a;
                        }
                        obj16 = obj8;
                    }
                    fhVar.getClass();
                    qhVar = new qh(fh.a(parsingContext, (ih) obj16, jSONObject11));
                }
                return qhVar;
            case 11:
                JSONObject jSONObject12 = (JSONObject) obj;
                String string10 = JsonPropertyParser.readString(parsingContext, jSONObject12, "type");
                int iHashCode3 = string10.hashCode();
                sy syVar11 = this.f17195b;
                switch (iHashCode3) {
                    case -1349088399:
                        if (string10.equals("custom")) {
                            return new o0(((sa) syVar11.B2.getValue()).deserialize(parsingContext, jSONObject12));
                        }
                        break;
                    case -906021636:
                        if (string10.equals("select")) {
                            return new o0(((in) syVar11.f18556v6.getValue()).deserialize(parsingContext, jSONObject12));
                        }
                        break;
                    case -899647263:
                        if (string10.equals("slider")) {
                            return new o0(((fp) syVar11.Z6.getValue()).deserialize(parsingContext, jSONObject12));
                        }
                        break;
                    case -889473228:
                        if (string10.equals("switch")) {
                            return new o0(((wq) syVar11.G7.getValue()).deserialize(parsingContext, jSONObject12));
                        }
                        break;
                    case -711999985:
                        if (string10.equals("indicator")) {
                            return new o0(((jf) syVar11.f18359c4.getValue()).deserialize(parsingContext, jSONObject12));
                        }
                        break;
                    case -410956671:
                        if (string10.equals(RRWebVideoEvent.JsonKeys.CONTAINER)) {
                            return new o0(((x9) syVar11.f18465m2.getValue()).deserialize(parsingContext, jSONObject12));
                        }
                        break;
                    case -196315310:
                        if (string10.equals("gallery")) {
                            return new o0(((vd) syVar11.K3.getValue()).deserialize(parsingContext, jSONObject12));
                        }
                        break;
                    case 102340:
                        if (string10.equals("gif")) {
                            return new o0(((ce) syVar11.N3.getValue()).deserialize(parsingContext, jSONObject12));
                        }
                        break;
                    case 3181382:
                        if (string10.equals("grid")) {
                            return new o0(((ie) syVar11.Q3.getValue()).deserialize(parsingContext, jSONObject12));
                        }
                        break;
                    case 3552126:
                        if (string10.equals("tabs")) {
                            return new o0(((fr) syVar11.J7.getValue()).deserialize(parsingContext, jSONObject12));
                        }
                        break;
                    case 3556653:
                        if (string10.equals("text")) {
                            return new o0(((ys) syVar11.f18480n8.getValue()).deserialize(parsingContext, jSONObject12));
                        }
                        break;
                    case 100313435:
                        if (string10.equals("image")) {
                            return new o0(((ue) syVar11.W3.getValue()).deserialize(parsingContext, jSONObject12));
                        }
                        break;
                    case 100358090:
                        if (string10.equals("input")) {
                            return new o0(((ng) syVar11.D4.getValue()).deserialize(parsingContext, jSONObject12));
                        }
                        break;
                    case 106426307:
                        if (string10.equals("pager")) {
                            return new o0(((ak) syVar11.f18566w5.getValue()).deserialize(parsingContext, jSONObject12));
                        }
                        break;
                    case 109757585:
                        if (string10.equals(SentryThread.JsonKeys.STATE)) {
                            return new o0(((tp) syVar11.f18459l7.getValue()).deserialize(parsingContext, jSONObject12));
                        }
                        break;
                    case 112202875:
                        if (string10.equals(RRWebVideoEvent.EVENT_TAG)) {
                            return new o0(((ow) syVar11.f18440j9.getValue()).deserialize(parsingContext, jSONObject12));
                        }
                        break;
                    case 1732829925:
                        if (string10.equals("separator")) {
                            return new o0(((sn) syVar11.B6.getValue()).deserialize(parsingContext, jSONObject12));
                        }
                        break;
                }
                EntityTemplate orThrow5 = parsingContext.getTemplates().getOrThrow(string10, jSONObject12);
                hs hsVar = orThrow5 instanceof hs ? (hs) orThrow5 : null;
                if (hsVar != null) {
                    return ((uh) syVar11.f18550u9.getValue()).resolve(parsingContext, hsVar, jSONObject12);
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject12, "type", string10);
            case 12:
                JSONObject jSONObject13 = (JSONObject) obj;
                String string11 = JsonPropertyParser.readString(parsingContext, jSONObject13, "type");
                boolean zA8 = Intrinsics.a(string11, "slide");
                sy syVar12 = this.f17195b;
                if (zA8) {
                    ((oj) syVar12.f18477n5.getValue()).getClass();
                    oj.a(parsingContext, jSONObject13);
                    return new fj();
                }
                if (Intrinsics.a(string11, "overlap")) {
                    ((ij) syVar12.f18447k5.getValue()).getClass();
                    ij.a(parsingContext, jSONObject13);
                    return new fj();
                }
                EntityTemplate orThrow6 = parsingContext.getTemplates().getOrThrow(string11, jSONObject13);
                vj vjVar = orThrow6 instanceof vj ? (vj) orThrow6 : null;
                if (vjVar != null) {
                    return ((gj) syVar12.f18526s5.getValue()).resolve(parsingContext, vjVar, jSONObject13);
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject13, "type", string11);
            case 13:
                JSONObject jSONObject14 = (JSONObject) obj;
                String string12 = JsonPropertyParser.readString(parsingContext, jSONObject14, "type");
                EntityTemplate entityTemplate6 = parsingContext.getTemplates().get(string12);
                Object obj17 = null;
                vj vjVar2 = entityTemplate6 instanceof vj ? (vj) entityTemplate6 : null;
                if (vjVar2 != null) {
                    if (vjVar2 instanceof uj) {
                        string12 = "slide";
                    } else {
                        if (!(vjVar2 instanceof tj)) {
                            throw new ij.j();
                        }
                        string12 = "overlap";
                    }
                }
                boolean zA9 = Intrinsics.a(string12, "slide");
                sy syVar13 = this.f17195b;
                if (zA9) {
                    pj pjVar = (pj) syVar13.f18486o5.getValue();
                    if (vjVar2 != null) {
                        if (vjVar2 instanceof uj) {
                            obj11 = ((uj) vjVar2).f18701a;
                        } else {
                            if (!(vjVar2 instanceof tj)) {
                                throw new ij.j();
                            }
                            obj11 = ((tj) vjVar2).f18650a;
                        }
                        obj17 = obj11;
                    }
                    pjVar.getClass();
                    tjVar = new uj(pj.a(parsingContext, (sj) obj17, jSONObject14));
                } else {
                    if (!Intrinsics.a(string12, "overlap")) {
                        throw ParsingExceptionKt.typeMismatch(jSONObject14, "type", string12);
                    }
                    jj jjVar = (jj) syVar13.f18457l5.getValue();
                    if (vjVar2 != null) {
                        if (vjVar2 instanceof uj) {
                            obj10 = ((uj) vjVar2).f18701a;
                        } else {
                            if (!(vjVar2 instanceof tj)) {
                                throw new ij.j();
                            }
                            obj10 = ((tj) vjVar2).f18650a;
                        }
                        obj17 = obj10;
                    }
                    jjVar.getClass();
                    tjVar = new tj(jj.a(parsingContext, (mj) obj17, jSONObject14));
                }
                return tjVar;
            case 14:
                JSONObject jSONObject15 = (JSONObject) obj;
                String string13 = JsonPropertyParser.readString(parsingContext, jSONObject15, "type");
                int iHashCode4 = string13.hashCode();
                sy syVar14 = this.f17195b;
                if (iHashCode4 != -921832806) {
                    if (iHashCode4 != 97445748) {
                        if (iHashCode4 == 343327108 && string13.equals("wrap_content")) {
                            ((xi) syVar14.f18381e5.getValue()).getClass();
                            return new ek();
                        }
                    } else if (string13.equals("fixed")) {
                        ((ji) syVar14.V4.getValue()).deserialize(parsingContext, jSONObject15);
                        return new ek();
                    }
                } else if (string13.equals("percentage")) {
                    ((bj) syVar14.f18414h5.getValue()).deserialize(parsingContext, jSONObject15);
                    return new ek();
                }
                EntityTemplate orThrow7 = parsingContext.getTemplates().getOrThrow(string13, jSONObject15);
                jk jkVar = orThrow7 instanceof jk ? (jk) orThrow7 : null;
                if (jkVar != null) {
                    return ((fk) syVar14.v5.getValue()).resolve(parsingContext, jkVar, jSONObject15);
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject15, "type", string13);
            case 15:
                JSONObject jSONObject16 = (JSONObject) obj;
                String string14 = JsonPropertyParser.readString(parsingContext, jSONObject16, "type");
                EntityTemplate entityTemplate7 = parsingContext.getTemplates().get(string14);
                jk jkVar2 = entityTemplate7 instanceof jk ? (jk) entityTemplate7 : null;
                if (jkVar2 != null) {
                    if (jkVar2 instanceof ik) {
                        string14 = "percentage";
                    } else if (jkVar2 instanceof gk) {
                        string14 = "fixed";
                    } else {
                        if (!(jkVar2 instanceof hk)) {
                            throw new ij.j();
                        }
                        string14 = "wrap_content";
                    }
                }
                int iHashCode5 = string14.hashCode();
                sy syVar15 = this.f17195b;
                if (iHashCode5 == -921832806) {
                    if (string14.equals("percentage")) {
                        cj cjVar = (cj) syVar15.f18425i5.getValue();
                        ej ejVar = (ej) (jkVar2 != null ? jkVar2.a() : null);
                        cjVar.getClass();
                        ikVar = new ik(new ej(JsonFieldParser.readField(ParsingContextKt.restrictPropertyOverride(parsingContext), jSONObject16, "page_width", parsingContext.getAllowPropertyOverride(), ejVar != null ? ejVar.f17151a : null, cjVar.f17027a.D5)));
                        return ikVar;
                    }
                    throw ParsingExceptionKt.typeMismatch(jSONObject16, "type", string14);
                }
                if (iHashCode5 == 97445748) {
                    if (string14.equals("fixed")) {
                        ki kiVar = (ki) syVar15.W4.getValue();
                        mi miVar = (mi) (jkVar2 != null ? jkVar2.a() : null);
                        kiVar.getClass();
                        ikVar = new gk(new mi(JsonFieldParser.readField(ParsingContextKt.restrictPropertyOverride(parsingContext), jSONObject16, "neighbour_page_width", parsingContext.getAllowPropertyOverride(), miVar != null ? miVar.f17869a : null, kiVar.f17581a.f18564w3)));
                        return ikVar;
                    }
                    throw ParsingExceptionKt.typeMismatch(jSONObject16, "type", string14);
                }
                if (iHashCode5 == 343327108 && string14.equals("wrap_content")) {
                    yi yiVar = (yi) syVar15.f18392f5.getValue();
                    yiVar.getClass();
                    ikVar = new hk(new aj());
                    return ikVar;
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject16, "type", string14);
            case 16:
                JSONObject jSONObject17 = (JSONObject) obj;
                JsonPropertyParser.readOptionalList(parsingContext, jSONObject17, "items", this.f17195b.f18530s9);
                return new of();
            case 17:
                JSONObject jSONObject18 = (JSONObject) obj;
                sy syVar16 = this.f17195b;
                JsonPropertyParser.readList(parsingContext, jSONObject18, "changes", syVar16.z5, nk.f17975c);
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject18, "mode", nk.f17974b, mg.B, nk.f17973a);
                ij.p pVar2 = syVar16.f18443k1;
                JsonPropertyParser.readOptionalList(parsingContext, jSONObject18, "on_applied_actions", pVar2);
                JsonPropertyParser.readOptionalList(parsingContext, jSONObject18, "on_failed_actions", pVar2);
                return new mk();
            case 18:
                JSONObject jSONObject19 = (JSONObject) obj;
                String optionalString = JsonPropertyParser.readOptionalString(parsingContext, jSONObject19, "type");
                if (optionalString == null) {
                    optionalString = "pivot-fixed";
                }
                boolean zEquals = optionalString.equals("pivot-fixed");
                sy syVar17 = this.f17195b;
                if (zEquals) {
                    ((yk) syVar17.I5.getValue()).getClass();
                    yk.a(parsingContext, jSONObject19);
                    return new wk();
                }
                if (optionalString.equals("pivot-percentage")) {
                    ((el) syVar17.L5.getValue()).getClass();
                    JsonExpressionParser.readExpression(parsingContext, jSONObject19, "value", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE);
                    return new wk();
                }
                EntityTemplate orThrow8 = parsingContext.getTemplates().getOrThrow(optionalString, jSONObject19);
                kl klVar = orThrow8 instanceof kl ? (kl) orThrow8 : null;
                if (klVar != null) {
                    return ((dl) syVar17.Q5.getValue()).resolve(parsingContext, klVar, jSONObject19);
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject19, "type", optionalString);
            case 19:
                JSONObject jSONObject20 = (JSONObject) obj;
                String optionalString2 = JsonPropertyParser.readOptionalString(parsingContext, jSONObject20, "type");
                if (optionalString2 == null) {
                    optionalString2 = "pivot-fixed";
                }
                EntityTemplate entityTemplate8 = parsingContext.getTemplates().get(optionalString2);
                Object obj18 = null;
                kl klVar2 = entityTemplate8 instanceof kl ? (kl) entityTemplate8 : null;
                if (klVar2 != null) {
                    if (klVar2 instanceof il) {
                        optionalString2 = "pivot-fixed";
                    } else {
                        if (!(klVar2 instanceof jl)) {
                            throw new ij.j();
                        }
                        optionalString2 = "pivot-percentage";
                    }
                }
                boolean zEquals2 = optionalString2.equals("pivot-fixed");
                sy syVar18 = this.f17195b;
                if (zEquals2) {
                    zk zkVar = (zk) syVar18.J5.getValue();
                    if (klVar2 != null) {
                        if (klVar2 instanceof il) {
                            obj13 = ((il) klVar2).f17394a;
                        } else {
                            if (!(klVar2 instanceof jl)) {
                                throw new ij.j();
                            }
                            obj13 = ((jl) klVar2).f17493a;
                        }
                        obj18 = obj13;
                    }
                    zkVar.getClass();
                    jlVar = new il(zk.a(parsingContext, (cl) obj18, jSONObject20));
                } else {
                    if (!optionalString2.equals("pivot-percentage")) {
                        throw ParsingExceptionKt.typeMismatch(jSONObject20, "type", optionalString2);
                    }
                    fl flVar = (fl) syVar18.M5.getValue();
                    if (klVar2 == null) {
                        obj12 = null;
                    } else if (klVar2 instanceof il) {
                        obj12 = ((il) klVar2).f17394a;
                    } else {
                        if (!(klVar2 instanceof jl)) {
                            throw new ij.j();
                        }
                        obj12 = ((jl) klVar2).f17493a;
                    }
                    hl hlVar = (hl) obj12;
                    flVar.getClass();
                    Field field3 = null;
                    boolean allowPropertyOverride3 = parsingContext.getAllowPropertyOverride();
                    ParsingContext parsingContextRestrictPropertyOverride3 = ParsingContextKt.restrictPropertyOverride(parsingContext);
                    TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
                    if (hlVar != null) {
                        field3 = hlVar.f17341a;
                    }
                    jlVar = new jl(new hl(JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride3, jSONObject20, "value", typeHelper3, allowPropertyOverride3, field3, ParsingConvertersKt.NUMBER_TO_DOUBLE)));
                }
                return jlVar;
            case 20:
                JSONObject jSONObject21 = (JSONObject) obj;
                ij.p pVar3 = this.f17195b.L2;
                return new ll();
            case 21:
                return a(parsingContext, obj);
            case 22:
                return b(parsingContext, obj);
            case 23:
                return c(parsingContext, obj);
            case 24:
                return d(parsingContext, obj);
            case 25:
                return e(parsingContext, obj);
            case 26:
                return f(parsingContext, obj);
            case 27:
                return g(parsingContext, obj);
            case 28:
                return h(parsingContext, obj);
            default:
                JSONObject jSONObject22 = (JSONObject) obj;
                String string15 = JsonPropertyParser.readString(parsingContext, jSONObject22, "type");
                EntityTemplate entityTemplate9 = parsingContext.getTemplates().get(string15);
                qo qoVar = entityTemplate9 instanceof qo ? (qo) entityTemplate9 : null;
                if (qoVar != null) {
                    if (qoVar instanceof no) {
                        string15 = "fixed";
                    } else if (qoVar instanceof oo) {
                        string15 = "match_parent";
                    } else {
                        if (!(qoVar instanceof po)) {
                            throw new ij.j();
                        }
                        string15 = "wrap_content";
                    }
                }
                int iHashCode6 = string15.hashCode();
                sy syVar19 = this.f17195b;
                if (iHashCode6 == 97445748) {
                    if (string15.equals("fixed")) {
                        ed edVar = (ed) syVar19.f18564w3.getValue();
                        Object objA2 = qoVar != null ? qoVar.a() : null;
                        edVar.getClass();
                        noVar = new no(ed.a(parsingContext, (hd) objA2, jSONObject22));
                        return noVar;
                    }
                    throw ParsingExceptionKt.typeMismatch(jSONObject22, "type", string15);
                }
                if (iHashCode6 == 343327108) {
                    if (string15.equals("wrap_content")) {
                        noVar = new po(((dx) syVar19.f18509q9.getValue()).deserialize(parsingContext, (fx) (qoVar != null ? qoVar.a() : null), jSONObject22));
                        return noVar;
                    }
                    throw ParsingExceptionKt.typeMismatch(jSONObject22, "type", string15);
                }
                if (iHashCode6 == 1386124388 && string15.equals("match_parent")) {
                    noVar = new oo(((gi) syVar19.T4.getValue()).deserialize(parsingContext, (ii) (qoVar != null ? qoVar.a() : null), jSONObject22));
                    return noVar;
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject22, "type", string15);
        }
    }
}
