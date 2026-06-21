package fh;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import io.sentry.protocol.DebugMeta;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class jp implements Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sy f17497b;

    public /* synthetic */ jp(sy syVar, int i) {
        this.f17496a = i;
        this.f17497b = syVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final Object a(ParsingContext parsingContext, Object obj) {
        Object xvVar;
        JSONObject jSONObject = (JSONObject) obj;
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate entityTemplate = parsingContext.getTemplates().get(string);
        aw awVar = entityTemplate instanceof aw ? (aw) entityTemplate : null;
        if (awVar != null) {
            if (awVar instanceof yv) {
                string = "string";
            } else if (awVar instanceof wv) {
                string = "integer";
            } else if (awVar instanceof xv) {
                string = "number";
            } else if (awVar instanceof uv) {
                string = "color";
            } else if (awVar instanceof tv) {
                string = "boolean";
            } else if (awVar instanceof zv) {
                string = "url";
            } else if (awVar instanceof vv) {
                string = "dict";
            } else {
                if (!(awVar instanceof sv)) {
                    throw new ij.j();
                }
                string = "array";
            }
        }
        int iHashCode = string.hashCode();
        sy syVar = this.f17497b;
        switch (iHashCode) {
            case -1034364087:
                if (string.equals("number")) {
                    uy uyVar = (uy) syVar.I9.getValue();
                    wy wyVar = (wy) (awVar != null ? awVar.a() : null);
                    uyVar.getClass();
                    xvVar = new xv(new wy(JsonFieldParser.readFieldWithExpression(ParsingContextKt.restrictPropertyOverride(parsingContext), jSONObject, "value", TypeHelpersKt.TYPE_HELPER_DOUBLE, parsingContext.getAllowPropertyOverride(), wyVar != null ? wyVar.f18961a : null, ParsingConvertersKt.NUMBER_TO_DOUBLE)));
                    return xvVar;
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
            case -891985903:
                if (string.equals("string")) {
                    qz qzVar = (qz) syVar.X9.getValue();
                    sz szVar = (sz) (awVar != null ? awVar.a() : null);
                    qzVar.getClass();
                    xvVar = new yv(new sz(JsonFieldParser.readFieldWithExpression(ParsingContextKt.restrictPropertyOverride(parsingContext), jSONObject, "value", TypeHelpersKt.TYPE_HELPER_STRING, parsingContext.getAllowPropertyOverride(), szVar != null ? szVar.f18600a : null)));
                    return xvVar;
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
            case 116079:
                if (string.equals("url")) {
                    yz yzVar = (yz) syVar.f18375da.getValue();
                    a00 a00Var = (a00) (awVar != null ? awVar.a() : null);
                    yzVar.getClass();
                    xvVar = new zv(new a00(JsonFieldParser.readFieldWithExpression(ParsingContextKt.restrictPropertyOverride(parsingContext), jSONObject, "value", TypeHelpersKt.TYPE_HELPER_URI, parsingContext.getAllowPropertyOverride(), a00Var != null ? a00Var.f16787a : null, ParsingConvertersKt.ANY_TO_URI)));
                    return xvVar;
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
            case 3083190:
                if (string.equals("dict")) {
                    h0 h0Var = (h0) syVar.f18591z.getValue();
                    j0 j0Var = (j0) (awVar != null ? awVar.a() : null);
                    h0Var.getClass();
                    xvVar = new vv(new j0(JsonFieldParser.readFieldWithExpression(ParsingContextKt.restrictPropertyOverride(parsingContext), jSONObject, "value", TypeHelpersKt.TYPE_HELPER_DICT, parsingContext.getAllowPropertyOverride(), j0Var != null ? j0Var.f17456a : null)));
                    return xvVar;
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
            case 64711720:
                if (string.equals("boolean")) {
                    j jVar = (j) syVar.f18409h.getValue();
                    l lVar = (l) (awVar != null ? awVar.a() : null);
                    jVar.getClass();
                    xvVar = new tv(new l(JsonFieldParser.readFieldWithExpression(ParsingContextKt.restrictPropertyOverride(parsingContext), jSONObject, "value", TypeHelpersKt.TYPE_HELPER_BOOLEAN, parsingContext.getAllowPropertyOverride(), lVar != null ? lVar.f17664a : null, ParsingConvertersKt.ANY_TO_BOOLEAN)));
                    return xvVar;
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
            case 93090393:
                if (string.equals("array")) {
                    b bVar = (b) syVar.f18343b.getValue();
                    d dVar = (d) (awVar != null ? awVar.a() : null);
                    bVar.getClass();
                    xvVar = new sv(new d(JsonFieldParser.readFieldWithExpression(ParsingContextKt.restrictPropertyOverride(parsingContext), jSONObject, "value", TypeHelpersKt.TYPE_HELPER_JSON_ARRAY, parsingContext.getAllowPropertyOverride(), dVar != null ? dVar.f17046a : null)));
                    return xvVar;
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
            case 94842723:
                if (string.equals("color")) {
                    r rVar = (r) syVar.f18471n.getValue();
                    t tVar = (t) (awVar != null ? awVar.a() : null);
                    rVar.getClass();
                    xvVar = new uv(new t(JsonFieldParser.readFieldWithExpression(ParsingContextKt.restrictPropertyOverride(parsingContext), jSONObject, "value", TypeHelpersKt.TYPE_HELPER_COLOR, parsingContext.getAllowPropertyOverride(), tVar != null ? tVar.f18601a : null, ParsingConvertersKt.STRING_TO_COLOR_INT)));
                    return xvVar;
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
            case 1958052158:
                if (string.equals("integer")) {
                    px pxVar = (px) syVar.C9.getValue();
                    rx rxVar = (rx) (awVar != null ? awVar.a() : null);
                    pxVar.getClass();
                    xvVar = new wv(new rx(JsonFieldParser.readFieldWithExpression(ParsingContextKt.restrictPropertyOverride(parsingContext), jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, parsingContext.getAllowPropertyOverride(), rxVar != null ? rxVar.f18284a : null, ParsingConvertersKt.NUMBER_TO_INT)));
                    return xvVar;
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
            default:
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final Object b(ParsingContext parsingContext, Object obj) {
        Object iwVar;
        JSONObject jSONObject = (JSONObject) obj;
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate entityTemplate = parsingContext.getTemplates().get(string);
        mw mwVar = entityTemplate instanceof mw ? (mw) entityTemplate : null;
        if (mwVar != null) {
            if (mwVar instanceof kw) {
                string = "string";
            } else if (mwVar instanceof iw) {
                string = "number";
            } else if (mwVar instanceof hw) {
                string = "integer";
            } else if (mwVar instanceof ew) {
                string = "boolean";
            } else if (mwVar instanceof fw) {
                string = "color";
            } else if (mwVar instanceof lw) {
                string = "url";
            } else if (mwVar instanceof gw) {
                string = "dict";
            } else if (mwVar instanceof dw) {
                string = "array";
            } else {
                if (!(mwVar instanceof jw)) {
                    throw new ij.j();
                }
                string = "property";
            }
        }
        int iHashCode = string.hashCode();
        mw mwVar2 = mwVar;
        sy syVar = this.f17497b;
        switch (iHashCode) {
            case -1034364087:
                if (string.equals("number")) {
                    yy yyVar = (yy) syVar.L9.getValue();
                    Object objA = mwVar2 != null ? mwVar2.a() : null;
                    yyVar.getClass();
                    iwVar = new iw(yy.a(parsingContext, (az) objA, jSONObject));
                    return iwVar;
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
            case -993141291:
                if (string.equals("property")) {
                    iwVar = new jw(((hz) syVar.R9.getValue()).deserialize(parsingContext, (kz) (mwVar2 != null ? mwVar2.a() : null), jSONObject));
                    return iwVar;
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
            case -891985903:
                if (string.equals("string")) {
                    uz uzVar = (uz) syVar.f18342aa.getValue();
                    Object objA2 = mwVar2 != null ? mwVar2.a() : null;
                    uzVar.getClass();
                    iwVar = new kw(uz.a(parsingContext, (wz) objA2, jSONObject));
                    return iwVar;
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
            case 116079:
                if (string.equals("url")) {
                    c00 c00Var = (c00) syVar.f18408ga.getValue();
                    Object objA3 = mwVar2 != null ? mwVar2.a() : null;
                    c00Var.getClass();
                    iwVar = new lw(c00.a(parsingContext, (e00) objA3, jSONObject));
                    return iwVar;
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
            case 3083190:
                if (string.equals("dict")) {
                    l0 l0Var = (l0) syVar.C.getValue();
                    Object objA4 = mwVar2 != null ? mwVar2.a() : null;
                    l0Var.getClass();
                    iwVar = new gw(l0.a(parsingContext, (n0) objA4, jSONObject));
                    return iwVar;
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
            case 64711720:
                if (string.equals("boolean")) {
                    n nVar = (n) syVar.f18441k.getValue();
                    Object objA5 = mwVar2 != null ? mwVar2.a() : null;
                    nVar.getClass();
                    iwVar = new ew(n.a(parsingContext, (p) objA5, jSONObject));
                    return iwVar;
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
            case 93090393:
                if (string.equals("array")) {
                    f fVar = (f) syVar.f18376e.getValue();
                    Object objA6 = mwVar2 != null ? mwVar2.a() : null;
                    fVar.getClass();
                    iwVar = new dw(f.a(parsingContext, (h) objA6, jSONObject));
                    return iwVar;
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
            case 94842723:
                if (string.equals("color")) {
                    v vVar = (v) syVar.f18501q.getValue();
                    Object objA7 = mwVar2 != null ? mwVar2.a() : null;
                    vVar.getClass();
                    iwVar = new fw(v.a(parsingContext, (x) objA7, jSONObject));
                    return iwVar;
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
            case 1958052158:
                if (string.equals("integer")) {
                    tx txVar = (tx) syVar.F9.getValue();
                    Object objA8 = mwVar2 != null ? mwVar2.a() : null;
                    txVar.getClass();
                    iwVar = new hw(tx.a(parsingContext, (vx) objA8, jSONObject));
                    return iwVar;
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
            default:
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [fh.tq] */
    /* JADX WARN: Type inference failed for: r1v72, types: [fh.ev] */
    /* JADX WARN: Type inference failed for: r2v15, types: [fh.mq] */
    /* JADX WARN: Type inference failed for: r2v65, types: [fh.tu] */
    /* JADX WARN: Type inference failed for: r3v137, types: [fh.pt] */
    /* JADX WARN: Type inference failed for: r3v193, types: [fh.aw] */
    /* JADX WARN: Type inference failed for: r3v213, types: [fh.mw] */
    /* JADX WARN: Type inference failed for: r3v63, types: [fh.ss] */
    /* JADX WARN: Type inference failed for: r3v93, types: [fh.dt] */
    /* JADX WARN: Type inference failed for: r4v140, types: [fh.eu] */
    /* JADX WARN: Type inference failed for: r4v187, types: [fh.rv] */
    /* JADX WARN: Type inference failed for: r4v222, types: [fh.cw] */
    /* JADX WARN: Type inference failed for: r4v58, types: [fh.vs] */
    /* JADX WARN: Type inference failed for: r4v97, types: [fh.gt] */
    @Override // com.yandex.div.serialization.Deserializer
    public final Object deserialize(ParsingContext parsingContext, Object obj) {
        Object rqVar;
        JsonTemplate jsonTemplate;
        JsonTemplate jsonTemplate2;
        Object usVar;
        JsonTemplate jsonTemplate3;
        JsonTemplate jsonTemplate4;
        Object etVar;
        JsonTemplate jsonTemplate5;
        JsonTemplate jsonTemplate6;
        Object duVar;
        JsonTemplate jsonTemplate7;
        JsonTemplate jsonTemplate8;
        Object cvVar;
        JsonTemplate jsonTemplate9;
        JsonTemplate jsonTemplate10;
        int i = this.f17496a;
        sy syVar = this.f17497b;
        switch (i) {
            case 0:
                JSONObject jSONObject = (JSONObject) obj;
                TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
                Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "end", typeHelper, function1);
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "start", typeHelper, function1);
                ij.p pVar = syVar.U2;
                return new nd();
            case 1:
                JSONObject jSONObject2 = (JSONObject) obj;
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject2, "font_family", TypeHelpersKt.TYPE_HELPER_STRING);
                TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
                Function1<Number, Long> function12 = ParsingConvertersKt.NUMBER_TO_INT;
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject2, "font_size", typeHelper2, function12, np.f18008g, np.f18002a);
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject2, "font_size_unit", np.f18006e, hn.f17349o, np.f18003b);
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject2, "font_variation_settings", TypeHelpersKt.TYPE_HELPER_DICT);
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject2, "font_weight", np.f18007f, w9.f18848w);
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject2, "font_weight_value", typeHelper2, function12, np.f18009h);
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject2, "letter_spacing", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE, np.f18004c);
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject2, "text_color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT, np.f18005d);
                return new cp();
            case 2:
                JSONObject jSONObject3 = (JSONObject) obj;
                ij.p pVar2 = syVar.f18503q1;
                JsonPropertyParser.readOptionalList(parsingContext, jSONObject3, "swipe_out_actions", syVar.f18443k1);
                return new zf();
            case 3:
                JSONObject jSONObject4 = (JSONObject) obj;
                JsonExpressionParser.readExpression(parsingContext, jSONObject4, "color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
                if (((hq) JsonPropertyParser.readOptional(parsingContext, jSONObject4, "style", syVar.A7)) == null) {
                    Expression expression = gq.f17303a;
                }
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject4, "unit", gq.f17305c, hn.f17349o, gq.f17303a);
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject4, "width", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE, gq.f17306d, gq.f17304b);
                return new fq();
            case 4:
                JSONObject jSONObject5 = (JSONObject) obj;
                String string = JsonPropertyParser.readString(parsingContext, jSONObject5, "type");
                if (Intrinsics.a(string, "solid")) {
                    ((nq) syVar.f18579x7.getValue()).getClass();
                    return new hq();
                }
                if (Intrinsics.a(string, "dashed")) {
                    ((iq) syVar.f18548u7.getValue()).getClass();
                    return new hq();
                }
                EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(string, jSONObject5);
                ?? r12 = orThrow instanceof tq ? (tq) orThrow : null;
                if (r12 != 0) {
                    return ((mq) syVar.C7.getValue()).a(r12);
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject5, "type", string);
            case 5:
                JSONObject jSONObject6 = (JSONObject) obj;
                String string2 = JsonPropertyParser.readString(parsingContext, jSONObject6, "type");
                EntityTemplate entityTemplate = parsingContext.getTemplates().get(string2);
                tq tqVar = entityTemplate instanceof tq ? (tq) entityTemplate : null;
                if (tqVar != null) {
                    if (tqVar instanceof sq) {
                        string2 = "solid";
                    } else {
                        if (!(tqVar instanceof rq)) {
                            throw new ij.j();
                        }
                        string2 = "dashed";
                    }
                }
                if (Intrinsics.a(string2, "solid")) {
                    oq oqVar = (oq) syVar.y7.getValue();
                    if (tqVar != null) {
                        if (tqVar instanceof sq) {
                            jsonTemplate2 = ((sq) tqVar).f18322a;
                        } else {
                            if (!(tqVar instanceof rq)) {
                                throw new ij.j();
                            }
                            jsonTemplate2 = ((rq) tqVar).f18259a;
                        }
                        jsonTemplate = jsonTemplate2;
                    }
                    oqVar.getClass();
                    rqVar = new sq(new qq());
                } else {
                    if (!Intrinsics.a(string2, "dashed")) {
                        throw ParsingExceptionKt.typeMismatch(jSONObject6, "type", string2);
                    }
                    jq jqVar = (jq) syVar.f18557v7.getValue();
                    if (tqVar != null) {
                        if (tqVar instanceof sq) {
                            jsonTemplate = ((sq) tqVar).f18322a;
                        } else {
                            if (!(tqVar instanceof rq)) {
                                throw new ij.j();
                            }
                            jsonTemplate = ((rq) tqVar).f18259a;
                        }
                        jsonTemplate = jsonTemplate;
                    }
                    jqVar.getClass();
                    rqVar = new rq(new lq());
                }
                return rqVar;
            case 6:
                JSONObject jSONObject7 = (JSONObject) obj;
                JsonExpressionParser.readExpression(parsingContext, jSONObject7, "title", TypeHelpersKt.TYPE_HELPER_STRING);
                return new zf();
            case 7:
                JSONObject jSONObject8 = (JSONObject) obj;
                ij.p pVar3 = syVar.f18554v3;
                if (((cd) JsonPropertyParser.readOptional(parsingContext, jSONObject8, "height", pVar3)) == null) {
                    int i10 = jr.f17498a;
                }
                JsonExpressionParser.readExpression(parsingContext, jSONObject8, "image_url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI);
                if (((cd) JsonPropertyParser.readOptional(parsingContext, jSONObject8, "width", pVar3)) == null) {
                    int i11 = jr.f17498a;
                }
                return new br();
            case 8:
                JSONObject jSONObject9 = (JSONObject) obj;
                TypeHelper<Integer> typeHelper3 = TypeHelpersKt.TYPE_HELPER_COLOR;
                Function1<Object, Integer> function13 = ParsingConvertersKt.STRING_TO_COLOR_INT;
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject9, "active_background_color", typeHelper3, function13, lr.f17752a);
                TypeHelper<JSONObject> typeHelper4 = TypeHelpersKt.TYPE_HELPER_DICT;
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject9, "active_font_variation_settings", typeHelper4);
                TypeHelper typeHelper5 = lr.f17761k;
                w9 w9Var = w9.f18848w;
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject9, "active_font_weight", typeHelper5, w9Var);
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject9, "active_text_color", typeHelper3, function13, lr.f17753b);
                TypeHelper<Long> typeHelper6 = TypeHelpersKt.TYPE_HELPER_INT;
                Function1<Number, Long> function14 = ParsingConvertersKt.NUMBER_TO_INT;
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject9, "animation_duration", typeHelper6, function14, lr.f17766p, lr.f17754c);
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject9, "animation_type", lr.f17762l, hn.G, lr.f17755d);
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject9, "corner_radius", typeHelper6, function14, lr.f17767q);
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject9, "font_family", TypeHelpersKt.TYPE_HELPER_STRING);
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject9, "font_size", typeHelper6, function14, lr.f17768r, lr.f17756e);
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject9, "font_size_unit", lr.f17763m, hn.f17349o, lr.f17757f);
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject9, "font_weight", lr.f17764n, w9Var, lr.f17758g);
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject9, "inactive_background_color", typeHelper3, function13);
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject9, "inactive_font_variation_settings", typeHelper4);
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject9, "inactive_font_weight", lr.f17765o, w9Var);
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject9, "inactive_text_color", typeHelper3, function13, lr.f17759h);
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject9, "item_spacing", typeHelper6, function14, lr.f17769s, lr.i);
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject9, "letter_spacing", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE, lr.f17760j);
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject9, "line_height", typeHelper6, function14, lr.f17770t);
                return new dr();
            case 9:
                JSONObject jSONObject10 = (JSONObject) obj;
                JsonPropertyParser.readOptionalList(parsingContext, jSONObject10, "actions", syVar.f18443k1);
                JsonPropertyParser.readOptionalList(parsingContext, jSONObject10, DebugMeta.JsonKeys.IMAGES, syVar.f18540t8);
                JsonPropertyParser.readOptionalList(parsingContext, jSONObject10, "ranges", syVar.f18508q8);
                JsonExpressionParser.readExpression(parsingContext, jSONObject10, "text", TypeHelpersKt.TYPE_HELPER_STRING);
                return new is();
            case 10:
                JSONObject jSONObject11 = (JSONObject) obj;
                String string3 = JsonPropertyParser.readString(parsingContext, jSONObject11, "type");
                if (Intrinsics.a(string3, "gradient")) {
                    ((zh) syVar.M4.getValue()).deserialize(parsingContext, jSONObject11);
                    return new rs();
                }
                if (Intrinsics.a(string3, "radial_gradient")) {
                    ((zl) syVar.f18437j6.getValue()).deserialize(parsingContext, jSONObject11);
                    return new rs();
                }
                EntityTemplate orThrow2 = parsingContext.getTemplates().getOrThrow(string3, jSONObject11);
                ?? r42 = orThrow2 instanceof vs ? (vs) orThrow2 : null;
                if (r42 != 0) {
                    return ((ss) syVar.X7.getValue()).resolve(parsingContext, r42, jSONObject11);
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject11, "type", string3);
            case 11:
                JSONObject jSONObject12 = (JSONObject) obj;
                String string4 = JsonPropertyParser.readString(parsingContext, jSONObject12, "type");
                EntityTemplate entityTemplate2 = parsingContext.getTemplates().get(string4);
                vs vsVar = entityTemplate2 instanceof vs ? (vs) entityTemplate2 : null;
                if (vsVar != null) {
                    if (vsVar instanceof ts) {
                        string4 = "gradient";
                    } else {
                        if (!(vsVar instanceof us)) {
                            throw new ij.j();
                        }
                        string4 = "radial_gradient";
                    }
                }
                if (Intrinsics.a(string4, "gradient")) {
                    ai aiVar = (ai) syVar.N4.getValue();
                    if (vsVar != null) {
                        if (vsVar instanceof ts) {
                            jsonTemplate4 = ((ts) vsVar).f18662a;
                        } else {
                            if (!(vsVar instanceof us)) {
                                throw new ij.j();
                            }
                            jsonTemplate4 = ((us) vsVar).f18711a;
                        }
                        jsonTemplate = jsonTemplate4;
                    }
                    usVar = new ts(aiVar.deserialize(parsingContext, (ei) jsonTemplate, jSONObject12));
                } else {
                    if (!Intrinsics.a(string4, "radial_gradient")) {
                        throw ParsingExceptionKt.typeMismatch(jSONObject12, "type", string4);
                    }
                    am amVar = (am) syVar.f18448k6.getValue();
                    if (vsVar != null) {
                        if (vsVar instanceof ts) {
                            jsonTemplate3 = ((ts) vsVar).f18662a;
                        } else {
                            if (!(vsVar instanceof us)) {
                                throw new ij.j();
                            }
                            jsonTemplate3 = ((us) vsVar).f18711a;
                        }
                        jsonTemplate = jsonTemplate3;
                    }
                    usVar = new us(amVar.deserialize(parsingContext, (tm) jsonTemplate, jSONObject12));
                }
                return usVar;
            case 12:
                JSONObject jSONObject13 = (JSONObject) obj;
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject13, "alignment_vertical", ws.f18930e, kr.f17620o, ws.f18926a);
                ij.p pVar4 = syVar.f18554v3;
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject13, "indexing_direction", ws.f18931f, kr.f17618m, ws.f18927b);
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject13, "preload_required", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN, ws.f18928c);
                JsonExpressionParser.readExpression(parsingContext, jSONObject13, "start", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, ws.f18933h);
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject13, "tint_color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject13, "tint_mode", ws.f18932g, v0.C, ws.f18929d);
                JsonExpressionParser.readExpression(parsingContext, jSONObject13, "url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI);
                return new ms();
            case 13:
                JSONObject jSONObject14 = (JSONObject) obj;
                String string5 = JsonPropertyParser.readString(parsingContext, jSONObject14, "type");
                if (Intrinsics.a(string5, "solid")) {
                    ((op) syVar.f18427i7.getValue()).getClass();
                    op.a(parsingContext, jSONObject14);
                    return new ct();
                }
                if (Intrinsics.a(string5, "cloud")) {
                    ((c9) syVar.f18334a2.getValue()).deserialize(parsingContext, jSONObject14);
                    return new ct();
                }
                EntityTemplate orThrow3 = parsingContext.getTemplates().getOrThrow(string5, jSONObject14);
                ?? r43 = orThrow3 instanceof gt ? (gt) orThrow3 : null;
                if (r43 != 0) {
                    return ((dt) syVar.f18340a8.getValue()).resolve(parsingContext, r43, jSONObject14);
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject14, "type", string5);
            case 14:
                JSONObject jSONObject15 = (JSONObject) obj;
                String string6 = JsonPropertyParser.readString(parsingContext, jSONObject15, "type");
                EntityTemplate entityTemplate3 = parsingContext.getTemplates().get(string6);
                gt gtVar = entityTemplate3 instanceof gt ? (gt) entityTemplate3 : null;
                if (gtVar != null) {
                    if (gtVar instanceof ft) {
                        string6 = "solid";
                    } else {
                        if (!(gtVar instanceof et)) {
                            throw new ij.j();
                        }
                        string6 = "cloud";
                    }
                }
                if (Intrinsics.a(string6, "solid")) {
                    pp ppVar = (pp) syVar.f18438j7.getValue();
                    if (gtVar != null) {
                        if (gtVar instanceof ft) {
                            jsonTemplate6 = ((ft) gtVar).f17229a;
                        } else {
                            if (!(gtVar instanceof et)) {
                                throw new ij.j();
                            }
                            jsonTemplate6 = ((et) gtVar).f17169a;
                        }
                        jsonTemplate = jsonTemplate6;
                    }
                    ppVar.getClass();
                    etVar = new ft(pp.a(parsingContext, (rp) jsonTemplate, jSONObject15));
                } else {
                    if (!Intrinsics.a(string6, "cloud")) {
                        throw ParsingExceptionKt.typeMismatch(jSONObject15, "type", string6);
                    }
                    d9 d9Var = (d9) syVar.b2.getValue();
                    if (gtVar != null) {
                        if (gtVar instanceof ft) {
                            jsonTemplate5 = ((ft) gtVar).f17229a;
                        } else {
                            if (!(gtVar instanceof et)) {
                                throw new ij.j();
                            }
                            jsonTemplate5 = ((et) gtVar).f17169a;
                        }
                        jsonTemplate = jsonTemplate5;
                    }
                    etVar = new et(d9Var.deserialize(parsingContext, (f9) jsonTemplate, jSONObject15));
                }
                return etVar;
            case 15:
                JSONObject jSONObject16 = (JSONObject) obj;
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject16, "corner_radius", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, j6.f17476r);
                return new ht();
            case 16:
                JSONObject jSONObject17 = (JSONObject) obj;
                JsonPropertyParser.readOptionalList(parsingContext, jSONObject17, "actions", syVar.f18443k1);
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject17, "alignment_vertical", kt.f17636d, kr.f17620o);
                TypeHelper<Double> typeHelper7 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
                Function1<Number, Double> function15 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject17, "baseline_offset", typeHelper7, function15, kt.f17633a);
                TypeHelper<Long> typeHelper8 = TypeHelpersKt.TYPE_HELPER_INT;
                Function1<Number, Long> function16 = ParsingConvertersKt.NUMBER_TO_INT;
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject17, "end", typeHelper8, function16, kt.i);
                TypeHelper<String> typeHelper9 = TypeHelpersKt.TYPE_HELPER_STRING;
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject17, "font_family", typeHelper9);
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject17, "font_feature_settings", typeHelper9);
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject17, "font_size", typeHelper8, function16, kt.f17641j);
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject17, "font_size_unit", kt.f17637e, hn.f17349o, kt.f17634b);
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject17, "font_variation_settings", TypeHelpersKt.TYPE_HELPER_DICT);
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject17, "font_weight", kt.f17638f, w9.f18848w);
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject17, "font_weight_value", typeHelper8, function16, kt.f17642k);
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject17, "letter_spacing", typeHelper7, function15);
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject17, "line_height", typeHelper8, function16, kt.f17643l);
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject17, "start", typeHelper8, function16, kt.f17644m, kt.f17635c);
                TypeHelper typeHelper10 = kt.f17639g;
                mg mgVar = mg.f17856o;
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject17, "strike", typeHelper10, mgVar);
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject17, "text_color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject17, "top_offset", typeHelper8, function16, kt.f17645n);
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject17, "underline", kt.f17640h, mgVar);
                return new ns();
            case 17:
                JSONObject jSONObject18 = (JSONObject) obj;
                String string7 = JsonPropertyParser.readString(parsingContext, jSONObject18, "type");
                if (Intrinsics.a(string7, "particles")) {
                    ((rt) syVar.f18383e8.getValue()).deserialize(parsingContext, jSONObject18);
                    return new lt();
                }
                if (Intrinsics.a(string7, "solid")) {
                    ((xt) syVar.f18417h8.getValue()).getClass();
                    xt.a(parsingContext, jSONObject18);
                    return new lt();
                }
                EntityTemplate orThrow4 = parsingContext.getTemplates().getOrThrow(string7, jSONObject18);
                ?? r44 = orThrow4 instanceof eu ? (eu) orThrow4 : null;
                if (r44 != 0) {
                    return ((pt) syVar.m8.getValue()).resolve(parsingContext, r44, jSONObject18);
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject18, "type", string7);
            case 18:
                JSONObject jSONObject19 = (JSONObject) obj;
                String string8 = JsonPropertyParser.readString(parsingContext, jSONObject19, "type");
                EntityTemplate entityTemplate4 = parsingContext.getTemplates().get(string8);
                eu euVar = entityTemplate4 instanceof eu ? (eu) entityTemplate4 : null;
                if (euVar != null) {
                    if (euVar instanceof cu) {
                        string8 = "particles";
                    } else {
                        if (!(euVar instanceof du)) {
                            throw new ij.j();
                        }
                        string8 = "solid";
                    }
                }
                if (Intrinsics.a(string8, "particles")) {
                    st stVar = (st) syVar.f18395f8.getValue();
                    if (euVar != null) {
                        if (euVar instanceof cu) {
                            jsonTemplate8 = ((cu) euVar).f17040a;
                        } else {
                            if (!(euVar instanceof du)) {
                                throw new ij.j();
                            }
                            jsonTemplate8 = ((du) euVar).f17119a;
                        }
                        jsonTemplate = jsonTemplate8;
                    }
                    duVar = new cu(stVar.deserialize(parsingContext, (vt) jsonTemplate, jSONObject19));
                } else {
                    if (!Intrinsics.a(string8, "solid")) {
                        throw ParsingExceptionKt.typeMismatch(jSONObject19, "type", string8);
                    }
                    yt ytVar = (yt) syVar.f18428i8.getValue();
                    if (euVar != null) {
                        if (euVar instanceof cu) {
                            jsonTemplate7 = ((cu) euVar).f17040a;
                        } else {
                            if (!(euVar instanceof du)) {
                                throw new ij.j();
                            }
                            jsonTemplate7 = ((du) euVar).f17119a;
                        }
                        jsonTemplate = jsonTemplate7;
                    }
                    ytVar.getClass();
                    duVar = new du(yt.a(parsingContext, (bu) jsonTemplate, jSONObject19));
                }
                return duVar;
            case 19:
                JSONObject jSONObject20 = (JSONObject) obj;
                TypeHelper<Long> typeHelper11 = TypeHelpersKt.TYPE_HELPER_INT;
                Function1<Number, Long> function17 = ParsingConvertersKt.NUMBER_TO_INT;
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject20, "duration", typeHelper11, function17, lu.f17775b, lu.f17774a);
                ij.p pVar5 = syVar.f18443k1;
                JsonPropertyParser.readOptionalList(parsingContext, jSONObject20, "end_actions", pVar5);
                JsonPropertyParser.readOptionalList(parsingContext, jSONObject20, "tick_actions", pVar5);
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject20, "tick_interval", typeHelper11, function17, lu.f17776c);
                return new ku();
            case 20:
                JSONObject jSONObject21 = (JSONObject) obj;
                ij.p pVar6 = syVar.f18503q1;
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject21, "background_accessibility_description", TypeHelpersKt.TYPE_HELPER_STRING);
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject21, "close_by_tap_outside", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN, ru.f18262a);
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject21, "duration", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, ru.f18265d, ru.f18263b);
                JsonExpressionParser.readExpression(parsingContext, jSONObject21, "position", ru.f18264c, kr.H);
                JsonPropertyParser.readOptionalList(parsingContext, jSONObject21, "tap_outside_actions", syVar.f18443k1);
                return new ou();
            case 21:
                JSONObject jSONObject22 = (JSONObject) obj;
                String string9 = JsonPropertyParser.readString(parsingContext, jSONObject22, "type");
                if (Intrinsics.a(string9, "non_modal")) {
                    ((yu) syVar.I8.getValue()).getClass();
                    return new su();
                }
                if (Intrinsics.a(string9, "modal")) {
                    ((uu) syVar.F8.getValue()).getClass();
                    return new su();
                }
                EntityTemplate orThrow5 = parsingContext.getTemplates().getOrThrow(string9, jSONObject22);
                ?? r13 = orThrow5 instanceof ev ? (ev) orThrow5 : null;
                if (r13 != 0) {
                    return ((tu) syVar.N8.getValue()).a(r13);
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject22, "type", string9);
            case 22:
                JSONObject jSONObject23 = (JSONObject) obj;
                String string10 = JsonPropertyParser.readString(parsingContext, jSONObject23, "type");
                EntityTemplate entityTemplate5 = parsingContext.getTemplates().get(string10);
                ev evVar = entityTemplate5 instanceof ev ? (ev) entityTemplate5 : null;
                if (evVar != null) {
                    if (evVar instanceof dv) {
                        string10 = "non_modal";
                    } else {
                        if (!(evVar instanceof cv)) {
                            throw new ij.j();
                        }
                        string10 = "modal";
                    }
                }
                if (Intrinsics.a(string10, "non_modal")) {
                    zu zuVar = (zu) syVar.J8.getValue();
                    if (evVar != null) {
                        if (evVar instanceof dv) {
                            jsonTemplate10 = ((dv) evVar).f17120a;
                        } else {
                            if (!(evVar instanceof cv)) {
                                throw new ij.j();
                            }
                            jsonTemplate10 = ((cv) evVar).f17041a;
                        }
                        jsonTemplate = jsonTemplate10;
                    }
                    zuVar.getClass();
                    cvVar = new dv(new bv());
                } else {
                    if (!Intrinsics.a(string10, "modal")) {
                        throw ParsingExceptionKt.typeMismatch(jSONObject23, "type", string10);
                    }
                    vu vuVar = (vu) syVar.G8.getValue();
                    if (evVar != null) {
                        if (evVar instanceof dv) {
                            jsonTemplate9 = ((dv) evVar).f17120a;
                        } else {
                            if (!(evVar instanceof cv)) {
                                throw new ij.j();
                            }
                            jsonTemplate9 = ((cv) evVar).f17041a;
                        }
                        jsonTemplate = jsonTemplate9;
                    }
                    vuVar.getClass();
                    cvVar = new cv(new xu());
                }
                return cvVar;
            case 23:
                JSONObject jSONObject24 = (JSONObject) obj;
                ij.p pVar7 = syVar.O5;
                if (((wk) JsonPropertyParser.readOptional(parsingContext, jSONObject24, "pivot_x", pVar7)) == null) {
                    int i12 = hv.f17374a;
                }
                if (((wk) JsonPropertyParser.readOptional(parsingContext, jSONObject24, "pivot_y", pVar7)) == null) {
                    int i13 = hv.f17374a;
                }
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject24, "rotation", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE);
                return new gv();
            case 24:
                JSONObject jSONObject25 = (JSONObject) obj;
                JsonPropertyParser.readList(parsingContext, jSONObject25, "actions", syVar.f18443k1, ov.f18071c);
                JsonExpressionParser.readExpression(parsingContext, jSONObject25, "condition", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN);
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject25, "mode", ov.f18070b, kv.f17647h, ov.f18069a);
                return new nv();
            case 25:
                JSONObject jSONObject26 = (JSONObject) obj;
                String string11 = JsonPropertyParser.readString(parsingContext, jSONObject26, "type");
                switch (string11.hashCode()) {
                    case -1034364087:
                        if (string11.equals("number")) {
                            ((ty) syVar.H9.getValue()).getClass();
                            JsonExpressionParser.readExpression(parsingContext, jSONObject26, "value", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE);
                            return new qv();
                        }
                        break;
                    case -891985903:
                        if (string11.equals("string")) {
                            ((pz) syVar.W9.getValue()).getClass();
                            JsonExpressionParser.readExpression(parsingContext, jSONObject26, "value", TypeHelpersKt.TYPE_HELPER_STRING);
                            return new qv();
                        }
                        break;
                    case 116079:
                        if (string11.equals("url")) {
                            ((xz) syVar.f18363ca.getValue()).getClass();
                            JsonExpressionParser.readExpression(parsingContext, jSONObject26, "value", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI);
                            return new qv();
                        }
                        break;
                    case 3083190:
                        if (string11.equals("dict")) {
                            ((g0) syVar.f18582y.getValue()).getClass();
                            JsonExpressionParser.readExpression(parsingContext, jSONObject26, "value", TypeHelpersKt.TYPE_HELPER_DICT);
                            return new qv();
                        }
                        break;
                    case 64711720:
                        if (string11.equals("boolean")) {
                            ((i) syVar.f18397g.getValue()).getClass();
                            JsonExpressionParser.readExpression(parsingContext, jSONObject26, "value", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN);
                            return new qv();
                        }
                        break;
                    case 93090393:
                        if (string11.equals("array")) {
                            ((a) syVar.f18331a.getValue()).getClass();
                            JsonExpressionParser.readExpression(parsingContext, jSONObject26, "value", TypeHelpersKt.TYPE_HELPER_JSON_ARRAY);
                            return new qv();
                        }
                        break;
                    case 94842723:
                        if (string11.equals("color")) {
                            ((q) syVar.f18462m.getValue()).getClass();
                            JsonExpressionParser.readExpression(parsingContext, jSONObject26, "value", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
                            return new qv();
                        }
                        break;
                    case 1958052158:
                        if (string11.equals("integer")) {
                            ((ox) syVar.B9.getValue()).getClass();
                            JsonExpressionParser.readExpression(parsingContext, jSONObject26, "value", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT);
                            return new qv();
                        }
                        break;
                }
                EntityTemplate orThrow6 = parsingContext.getTemplates().getOrThrow(string11, jSONObject26);
                ?? r32 = orThrow6 instanceof aw ? (aw) orThrow6 : null;
                if (r32 != 0) {
                    return ((rv) syVar.Z8.getValue()).resolve(parsingContext, r32, jSONObject26);
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject26, "type", string11);
            case 26:
                return a(parsingContext, obj);
            case 27:
                JSONObject jSONObject27 = (JSONObject) obj;
                String string12 = JsonPropertyParser.readString(parsingContext, jSONObject27, "type");
                switch (string12.hashCode()) {
                    case -1034364087:
                        if (string12.equals("number")) {
                            ((xy) syVar.K9.getValue()).getClass();
                            xy.a(parsingContext, jSONObject27);
                            return new bw();
                        }
                        break;
                    case -993141291:
                        if (string12.equals("property")) {
                            ((gz) syVar.Q9.getValue()).deserialize(parsingContext, jSONObject27);
                            return new bw();
                        }
                        break;
                    case -891985903:
                        if (string12.equals("string")) {
                            ((tz) syVar.Z9.getValue()).getClass();
                            tz.a(parsingContext, jSONObject27);
                            return new bw();
                        }
                        break;
                    case 116079:
                        if (string12.equals("url")) {
                            ((b00) syVar.fa.getValue()).getClass();
                            b00.a(parsingContext, jSONObject27);
                            return new bw();
                        }
                        break;
                    case 3083190:
                        if (string12.equals("dict")) {
                            ((k0) syVar.B.getValue()).getClass();
                            k0.a(parsingContext, jSONObject27);
                            return new bw();
                        }
                        break;
                    case 64711720:
                        if (string12.equals("boolean")) {
                            ((m) syVar.f18430j.getValue()).getClass();
                            m.a(parsingContext, jSONObject27);
                            return new bw();
                        }
                        break;
                    case 93090393:
                        if (string12.equals("array")) {
                            ((e) syVar.f18364d.getValue()).getClass();
                            e.a(parsingContext, jSONObject27);
                            return new bw();
                        }
                        break;
                    case 94842723:
                        if (string12.equals("color")) {
                            ((u) syVar.f18491p.getValue()).getClass();
                            u.a(parsingContext, jSONObject27);
                            return new bw();
                        }
                        break;
                    case 1958052158:
                        if (string12.equals("integer")) {
                            ((sx) syVar.E9.getValue()).getClass();
                            sx.a(parsingContext, jSONObject27);
                            return new bw();
                        }
                        break;
                }
                EntityTemplate orThrow7 = parsingContext.getTemplates().getOrThrow(string12, jSONObject27);
                ?? r33 = orThrow7 instanceof mw ? (mw) orThrow7 : null;
                if (r33 != 0) {
                    return ((cw) syVar.c9.getValue()).resolve(parsingContext, r33, jSONObject27);
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject27, "type", string12);
            case 28:
                return b(parsingContext, obj);
            default:
                JSONObject jSONObject28 = (JSONObject) obj;
                JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject28, "bitrate", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT);
                JsonExpressionParser.readExpression(parsingContext, jSONObject28, "mime_type", TypeHelpersKt.TYPE_HELPER_STRING);
                JsonExpressionParser.readExpression(parsingContext, jSONObject28, "url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI);
                return new zf();
        }
    }
}
