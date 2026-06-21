package fh;

import android.net.Uri;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateDeserializer;
import io.appmetrica.analytics.impl.A2;
import io.sentry.SentryLogEvent;
import io.sentry.protocol.DebugMeta;
import io.sentry.protocol.Request;
import io.sentry.protocol.ViewHierarchyNode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class c3 implements TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sy f16995b;

    public /* synthetic */ c3(sy syVar, int i) {
        this.f16994a = i;
        this.f16995b = syVar;
    }

    private final EntityTemplate a(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
        iu iuVar = (iu) entityTemplate;
        JSONObject jSONObject = (JSONObject) obj;
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        Field field = iuVar != null ? iuVar.f17428a : null;
        sy syVar = this.f16995b;
        Field optionalListField = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "actions", allowPropertyOverride, field, syVar.f18453l1);
        Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_vertical", kt.f17636d, allowPropertyOverride, iuVar != null ? iuVar.f17429b : null, kr.f17620o);
        Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, A2.f22054g, allowPropertyOverride, iuVar != null ? iuVar.f17430c : null, syVar.Z7);
        TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
        Field field2 = iuVar != null ? iuVar.f17431d : null;
        Function1<Number, Double> function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
        Field optionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "baseline_offset", typeHelper, allowPropertyOverride, field2, function1);
        Field optionalField2 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "border", allowPropertyOverride, iuVar != null ? iuVar.f17432e : null, syVar.c8);
        TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
        Field field3 = iuVar != null ? iuVar.f17433f : null;
        Function1<Number, Long> function12 = ParsingConvertersKt.NUMBER_TO_INT;
        Field optionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "end", typeHelper2, allowPropertyOverride, field3, function12, kt.i);
        TypeHelper<String> typeHelper3 = TypeHelpersKt.TYPE_HELPER_STRING;
        Field optionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_family", typeHelper3, allowPropertyOverride, iuVar != null ? iuVar.f17434g : null);
        Field optionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_feature_settings", typeHelper3, allowPropertyOverride, iuVar != null ? iuVar.f17435h : null);
        Field optionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_size", typeHelper2, allowPropertyOverride, iuVar != null ? iuVar.i : null, function12, kt.f17641j);
        Field optionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_size_unit", kt.f17637e, allowPropertyOverride, iuVar != null ? iuVar.f17436j : null, hn.f17349o);
        Field optionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_variation_settings", TypeHelpersKt.TYPE_HELPER_DICT, allowPropertyOverride, iuVar != null ? iuVar.f17437k : null);
        Field optionalFieldWithExpression9 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_weight", kt.f17638f, allowPropertyOverride, iuVar != null ? iuVar.f17438l : null, w9.f18848w);
        Field optionalFieldWithExpression10 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_weight_value", typeHelper2, allowPropertyOverride, iuVar != null ? iuVar.f17439m : null, function12, kt.f17642k);
        Field optionalFieldWithExpression11 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "letter_spacing", typeHelper, allowPropertyOverride, iuVar != null ? iuVar.f17440n : null, function1);
        Field optionalFieldWithExpression12 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "line_height", typeHelper2, allowPropertyOverride, iuVar != null ? iuVar.f17441o : null, function12, kt.f17643l);
        Field optionalField3 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "mask", allowPropertyOverride, iuVar != null ? iuVar.f17442p : null, syVar.f18460l8);
        Field optionalFieldWithExpression13 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "start", typeHelper2, allowPropertyOverride, iuVar != null ? iuVar.f17443q : null, function12, kt.f17644m);
        TypeHelper typeHelper4 = kt.f17639g;
        Field field4 = iuVar != null ? iuVar.f17444r : null;
        mg mgVar = mg.f17856o;
        return new iu(optionalListField, optionalFieldWithExpression, optionalField, optionalFieldWithExpression2, optionalField2, optionalFieldWithExpression3, optionalFieldWithExpression4, optionalFieldWithExpression5, optionalFieldWithExpression6, optionalFieldWithExpression7, optionalFieldWithExpression8, optionalFieldWithExpression9, optionalFieldWithExpression10, optionalFieldWithExpression11, optionalFieldWithExpression12, optionalField3, optionalFieldWithExpression13, JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "strike", typeHelper4, allowPropertyOverride, field4, mgVar), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "text_color", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, iuVar != null ? iuVar.f17445s : null, ParsingConvertersKt.STRING_TO_COLOR_INT), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "text_shadow", allowPropertyOverride, iuVar != null ? iuVar.f17446t : null, syVar.I6), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "top_offset", typeHelper2, allowPropertyOverride, iuVar != null ? iuVar.f17447u : null, function12, kt.f17645n), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "underline", kt.f17640h, allowPropertyOverride, iuVar != null ? iuVar.f17448v : null, mgVar));
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public final EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
        switch (this.f16994a) {
            case 0:
                b5 b5Var = (b5) entityTemplate;
                JSONObject jSONObject = (JSONObject) obj;
                boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
                ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
                Field field = b5Var != null ? b5Var.f16893a : null;
                sy syVar = this.f16995b;
                Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "download_callbacks", allowPropertyOverride, field, syVar.S2);
                Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "is_enabled", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, b5Var != null ? b5Var.f16894b : null, ParsingConvertersKt.ANY_TO_BOOLEAN);
                Field fieldWithExpression = JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "log_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, b5Var != null ? b5Var.f16895c : null);
                TypeHelper<Uri> typeHelper = TypeHelpersKt.TYPE_HELPER_URI;
                Field field2 = b5Var != null ? b5Var.f16896d : null;
                Function1<Object, Uri> function1 = ParsingConvertersKt.ANY_TO_URI;
                return new b5(optionalField, optionalFieldWithExpression, fieldWithExpression, JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "log_url", typeHelper, allowPropertyOverride, field2, function1), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "menu_items", allowPropertyOverride, b5Var != null ? b5Var.f16897e : null, syVar.f18483o1), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "payload", allowPropertyOverride, b5Var != null ? b5Var.f16898f : null), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "referer", typeHelper, allowPropertyOverride, b5Var != null ? b5Var.f16899g : null, function1), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "scope_id", allowPropertyOverride, b5Var != null ? b5Var.f16900h : null), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "target", e3.f17130b, allowPropertyOverride, b5Var != null ? b5Var.i : null, v0.f18721j), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "typed", allowPropertyOverride, b5Var != null ? b5Var.f16901j : null, syVar.f18356c1), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "url", typeHelper, allowPropertyOverride, b5Var != null ? b5Var.f16902k : null, function1));
            case 1:
                a5 a5Var = (a5) entityTemplate;
                JSONObject jSONObject2 = (JSONObject) obj;
                boolean allowPropertyOverride2 = parsingContext.getAllowPropertyOverride();
                ParsingContext parsingContextRestrictPropertyOverride2 = ParsingContextKt.restrictPropertyOverride(parsingContext);
                Field field3 = a5Var != null ? a5Var.f16795a : null;
                sy syVar2 = this.f16995b;
                return new a5(JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride2, jSONObject2, "action", allowPropertyOverride2, field3, syVar2.f18453l1), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride2, jSONObject2, "actions", allowPropertyOverride2, a5Var != null ? a5Var.f16796b : null, syVar2.f18453l1), JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride2, jSONObject2, "text", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride2, a5Var != null ? a5Var.f16797c : null));
            case 2:
                y4 y4Var = (y4) entityTemplate;
                JSONObject jSONObject3 = (JSONObject) obj;
                boolean allowPropertyOverride3 = parsingContext.getAllowPropertyOverride();
                ParsingContext parsingContextRestrictPropertyOverride3 = ParsingContextKt.restrictPropertyOverride(parsingContext);
                return new y4(JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride3, jSONObject3, "headers", allowPropertyOverride3, y4Var != null ? y4Var.f19076a : null, this.f16995b.W0), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride3, jSONObject3, Request.JsonKeys.METHOD, w4.f18823b, allowPropertyOverride3, y4Var != null ? y4Var.f19077b : null, v0.f18727p), JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride3, jSONObject3, "url", TypeHelpersKt.TYPE_HELPER_URI, allowPropertyOverride3, y4Var != null ? y4Var.f19078c : null, ParsingConvertersKt.ANY_TO_URI));
            case 3:
                y6 y6Var = (y6) entityTemplate;
                JSONObject jSONObject4 = (JSONObject) obj;
                boolean allowPropertyOverride4 = parsingContext.getAllowPropertyOverride();
                ParsingContext parsingContextRestrictPropertyOverride4 = ParsingContextKt.restrictPropertyOverride(parsingContext);
                TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
                Field field4 = y6Var != null ? y6Var.f19080a : null;
                Function1<Number, Long> function12 = ParsingConvertersKt.NUMBER_TO_INT;
                Field optionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride4, jSONObject4, "duration", typeHelper2, allowPropertyOverride4, field4, function12, x6.f18991f);
                TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
                Field field5 = y6Var != null ? y6Var.f19081b : null;
                Function1<Number, Double> function13 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
                Field optionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride4, jSONObject4, "end_value", typeHelper3, allowPropertyOverride4, field5, function13);
                Field optionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride4, jSONObject4, "interpolator", x6.f18989d, allowPropertyOverride4, y6Var != null ? y6Var.f19082c : null, v0.f18737z);
                Field field6 = y6Var != null ? y6Var.f19083d : null;
                sy syVar3 = this.f16995b;
                return new y6(optionalFieldWithExpression2, optionalFieldWithExpression3, optionalFieldWithExpression4, JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride4, jSONObject4, "items", allowPropertyOverride4, field6, syVar3.f18512r1), JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride4, jSONObject4, "name", x6.f18990e, allowPropertyOverride4, y6Var != null ? y6Var.f19084e : null, v0.f18735x), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride4, jSONObject4, "repeat", allowPropertyOverride4, y6Var != null ? y6Var.f19085f : null, syVar3.f18563w2), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride4, jSONObject4, "start_delay", typeHelper2, allowPropertyOverride4, y6Var != null ? y6Var.f19086g : null, function12, x6.f18992g), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride4, jSONObject4, "start_value", typeHelper3, allowPropertyOverride4, y6Var != null ? y6Var.f19087h : null, function13));
            case 4:
                g8 g8Var = (g8) entityTemplate;
                JSONObject jSONObject5 = (JSONObject) obj;
                boolean allowPropertyOverride5 = parsingContext.getAllowPropertyOverride();
                ParsingContext parsingContextRestrictPropertyOverride5 = ParsingContextKt.restrictPropertyOverride(parsingContext);
                Field optionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride5, jSONObject5, "corner_radius", TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride5, g8Var != null ? g8Var.f17260a : null, ParsingConvertersKt.NUMBER_TO_INT, f8.f17182b);
                Field field7 = g8Var != null ? g8Var.f17261b : null;
                sy syVar4 = this.f16995b;
                return new g8(optionalFieldWithExpression5, JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride5, jSONObject5, "corners_radius", allowPropertyOverride5, field7, syVar4.f18534t2), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride5, jSONObject5, "has_shadow", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride5, g8Var != null ? g8Var.f17262c : null, ParsingConvertersKt.ANY_TO_BOOLEAN), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride5, jSONObject5, "shadow", allowPropertyOverride5, g8Var != null ? g8Var.f17263d : null, syVar4.I6), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride5, jSONObject5, "stroke", allowPropertyOverride5, g8Var != null ? g8Var.f17264e : null, syVar4.E7));
            case 5:
                k9 k9Var = (k9) entityTemplate;
                JSONObject jSONObject6 = (JSONObject) obj;
                boolean allowPropertyOverride6 = parsingContext.getAllowPropertyOverride();
                ParsingContext parsingContextRestrictPropertyOverride6 = ParsingContextKt.restrictPropertyOverride(parsingContext);
                return new k9(JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride6, jSONObject6, "data", TypeHelpersKt.TYPE_HELPER_JSON_ARRAY, allowPropertyOverride6, k9Var != null ? k9Var.f17567a : null), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride6, jSONObject6, "data_element_name", allowPropertyOverride6, k9Var != null ? k9Var.f17568b : null), JsonFieldParser.readListField(parsingContextRestrictPropertyOverride6, jSONObject6, "prototypes", allowPropertyOverride6, k9Var != null ? k9Var.f17569c : null, this.f16995b.f18411h2, j6.f17466g));
            case 6:
                j9 j9Var = (j9) entityTemplate;
                JSONObject jSONObject7 = (JSONObject) obj;
                boolean allowPropertyOverride7 = parsingContext.getAllowPropertyOverride();
                ParsingContext parsingContextRestrictPropertyOverride7 = ParsingContextKt.restrictPropertyOverride(parsingContext);
                return new j9(JsonFieldParser.readField(parsingContextRestrictPropertyOverride7, jSONObject7, "div", allowPropertyOverride7, j9Var != null ? j9Var.f17482a : null, this.f16995b.f18541t9), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride7, jSONObject7, "id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride7, j9Var != null ? j9Var.f17483b : null), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride7, jSONObject7, "selector", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride7, j9Var != null ? j9Var.f17484c : null, ParsingConvertersKt.ANY_TO_BOOLEAN));
            case 7:
                ca caVar = (ca) entityTemplate;
                JSONObject jSONObject8 = (JSONObject) obj;
                boolean allowPropertyOverride8 = parsingContext.getAllowPropertyOverride();
                ParsingContext parsingContextRestrictPropertyOverride8 = ParsingContextKt.restrictPropertyOverride(parsingContext);
                Field field8 = caVar != null ? caVar.f17006a : null;
                sy syVar5 = this.f16995b;
                Field optionalField2 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride8, jSONObject8, "margins", allowPropertyOverride8, field8, syVar5.Y2);
                TypeHelper<Boolean> typeHelper4 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
                Field field9 = caVar != null ? caVar.f17007b : null;
                Function1<Object, Boolean> function14 = ParsingConvertersKt.ANY_TO_BOOLEAN;
                return new ca(optionalField2, JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride8, jSONObject8, "show_at_end", typeHelper4, allowPropertyOverride8, field9, function14), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride8, jSONObject8, "show_at_start", typeHelper4, allowPropertyOverride8, caVar != null ? caVar.f17008c : null, function14), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride8, jSONObject8, "show_between", typeHelper4, allowPropertyOverride8, caVar != null ? caVar.f17009d : null, function14), JsonFieldParser.readField(parsingContextRestrictPropertyOverride8, jSONObject8, "style", allowPropertyOverride8, caVar != null ? caVar.f17010e : null, syVar5.V2));
            case 8:
                bb bbVar = (bb) entityTemplate;
                JSONObject jSONObject9 = (JSONObject) obj;
                boolean allowPropertyOverride9 = parsingContext.getAllowPropertyOverride();
                ParsingContext parsingContextRestrictPropertyOverride9 = ParsingContextKt.restrictPropertyOverride(parsingContext);
                Field field10 = bbVar != null ? bbVar.f16911a : null;
                sy syVar6 = this.f16995b;
                Field optionalListField = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride9, jSONObject9, "functions", allowPropertyOverride9, field10, syVar6.I3);
                Field field11 = JsonFieldParser.readField(parsingContextRestrictPropertyOverride9, jSONObject9, "log_id", allowPropertyOverride9, bbVar != null ? bbVar.f16912b : null);
                Field field12 = bbVar != null ? bbVar.f16913c : null;
                ij.p pVar = syVar6.G2;
                m9 m9Var = za.f19209c;
                Intrinsics.c(m9Var, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
                return new bb(optionalListField, field11, JsonFieldParser.readListField(parsingContextRestrictPropertyOverride9, jSONObject9, "states", allowPropertyOverride9, field12, pVar, m9Var), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride9, jSONObject9, "timers", allowPropertyOverride9, bbVar != null ? bbVar.f16914d : null, syVar6.D8), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride9, jSONObject9, "transition_animation_selector", za.f19208b, allowPropertyOverride9, bbVar != null ? bbVar.f16915e : null, kr.J), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride9, jSONObject9, "variable_triggers", allowPropertyOverride9, bbVar != null ? bbVar.f16916f : null, syVar6.V8), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride9, jSONObject9, "variables", allowPropertyOverride9, bbVar != null ? bbVar.f16917g : null, syVar6.f18352b9));
            case 9:
                ab abVar = (ab) entityTemplate;
                JSONObject jSONObject10 = (JSONObject) obj;
                boolean allowPropertyOverride10 = parsingContext.getAllowPropertyOverride();
                ParsingContext parsingContextRestrictPropertyOverride10 = ParsingContextKt.restrictPropertyOverride(parsingContext);
                return new ab(JsonFieldParser.readField(parsingContextRestrictPropertyOverride10, jSONObject10, "div", allowPropertyOverride10, abVar != null ? abVar.f16825a : null, this.f16995b.f18541t9), JsonFieldParser.readField(parsingContextRestrictPropertyOverride10, jSONObject10, "state_id", allowPropertyOverride10, abVar != null ? abVar.f16826b : null, ParsingConvertersKt.NUMBER_TO_INT));
            case 10:
                nb nbVar = (nb) entityTemplate;
                JSONObject jSONObject11 = (JSONObject) obj;
                boolean allowPropertyOverride11 = parsingContext.getAllowPropertyOverride();
                ParsingContext parsingContextRestrictPropertyOverride11 = ParsingContextKt.restrictPropertyOverride(parsingContext);
                TypeHelper<Long> typeHelper5 = TypeHelpersKt.TYPE_HELPER_INT;
                Field field13 = nbVar != null ? nbVar.f17935a : null;
                Function1<Number, Long> function15 = ParsingConvertersKt.NUMBER_TO_INT;
                Field optionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride11, jSONObject11, "disappear_duration", typeHelper5, allowPropertyOverride11, field13, function15, mb.f17797e);
                Field field14 = nbVar != null ? nbVar.f17936b : null;
                sy syVar7 = this.f16995b;
                Field optionalField3 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride11, jSONObject11, "download_callbacks", allowPropertyOverride11, field14, syVar7.S2);
                Field optionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride11, jSONObject11, "is_enabled", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride11, nbVar != null ? nbVar.f17937c : null, ParsingConvertersKt.ANY_TO_BOOLEAN);
                Field fieldWithExpression2 = JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride11, jSONObject11, "log_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride11, nbVar != null ? nbVar.f17938d : null);
                Field optionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride11, jSONObject11, "log_limit", typeHelper5, allowPropertyOverride11, nbVar != null ? nbVar.f17939e : null, function15, mb.f17798f);
                Field optionalField4 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride11, jSONObject11, "payload", allowPropertyOverride11, nbVar != null ? nbVar.f17940f : null);
                TypeHelper<Uri> typeHelper6 = TypeHelpersKt.TYPE_HELPER_URI;
                Field field15 = nbVar != null ? nbVar.f17941g : null;
                Function1<Object, Uri> function16 = ParsingConvertersKt.ANY_TO_URI;
                return new nb(optionalFieldWithExpression6, optionalField3, optionalFieldWithExpression7, fieldWithExpression2, optionalFieldWithExpression8, optionalField4, JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride11, jSONObject11, "referer", typeHelper6, allowPropertyOverride11, field15, function16), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride11, jSONObject11, "scope_id", allowPropertyOverride11, nbVar != null ? nbVar.f17942h : null), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride11, jSONObject11, "typed", allowPropertyOverride11, nbVar != null ? nbVar.i : null, syVar7.f18356c1), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride11, jSONObject11, "url", typeHelper6, allowPropertyOverride11, nbVar != null ? nbVar.f17943j : null, function16), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride11, jSONObject11, "visibility_percentage", typeHelper5, allowPropertyOverride11, nbVar != null ? nbVar.f17944k : null, function15, mb.f17799g));
            case 11:
                pb pbVar = (pb) entityTemplate;
                JSONObject jSONObject12 = (JSONObject) obj;
                boolean allowPropertyOverride12 = parsingContext.getAllowPropertyOverride();
                ParsingContext parsingContextRestrictPropertyOverride12 = ParsingContextKt.restrictPropertyOverride(parsingContext);
                Field field16 = pbVar != null ? pbVar.f18088a : null;
                sy syVar8 = this.f16995b;
                return new pb(JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride12, jSONObject12, "on_fail_actions", allowPropertyOverride12, field16, syVar8.f18453l1), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride12, jSONObject12, "on_success_actions", allowPropertyOverride12, pbVar != null ? pbVar.f18089b : null, syVar8.f18453l1));
            case 12:
                ld ldVar = (ld) entityTemplate;
                JSONObject jSONObject13 = (JSONObject) obj;
                boolean allowPropertyOverride13 = parsingContext.getAllowPropertyOverride();
                ParsingContext parsingContextRestrictPropertyOverride13 = ParsingContextKt.restrictPropertyOverride(parsingContext);
                Field field17 = ldVar != null ? ldVar.f17686a : null;
                sy syVar9 = this.f16995b;
                ij.p pVar2 = syVar9.G1;
                ij.p pVar3 = syVar9.f18453l1;
                return new ld(JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride13, jSONObject13, A2.f22054g, allowPropertyOverride13, field17, pVar2), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride13, jSONObject13, "border", allowPropertyOverride13, ldVar != null ? ldVar.f17687b : null, syVar9.M1), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride13, jSONObject13, "next_focus_ids", allowPropertyOverride13, ldVar != null ? ldVar.f17688c : null, syVar9.C3), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride13, jSONObject13, "on_blur", allowPropertyOverride13, ldVar != null ? ldVar.f17689d : null, pVar3), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride13, jSONObject13, "on_focus", allowPropertyOverride13, ldVar != null ? ldVar.f17690e : null, pVar3));
            case 13:
                pd pdVar = (pd) entityTemplate;
                JSONObject jSONObject14 = (JSONObject) obj;
                boolean allowPropertyOverride14 = parsingContext.getAllowPropertyOverride();
                ParsingContext parsingContextRestrictPropertyOverride14 = ParsingContextKt.restrictPropertyOverride(parsingContext);
                return new pd(JsonFieldParser.readListField(parsingContextRestrictPropertyOverride14, jSONObject14, "arguments", allowPropertyOverride14, pdVar != null ? pdVar.f18090a : null, this.f16995b.F3), JsonFieldParser.readField(parsingContextRestrictPropertyOverride14, jSONObject14, SentryLogEvent.JsonKeys.BODY, allowPropertyOverride14, pdVar != null ? pdVar.f18091b : null), JsonFieldParser.readField(parsingContextRestrictPropertyOverride14, jSONObject14, "name", allowPropertyOverride14, pdVar != null ? pdVar.f18092c : null, j6.f17471m), JsonFieldParser.readField(parsingContextRestrictPropertyOverride14, jSONObject14, "return_type", allowPropertyOverride14, pdVar != null ? pdVar.f18093d : null, w9.f18845t));
            case 14:
                ok okVar = (ok) entityTemplate;
                JSONObject jSONObject15 = (JSONObject) obj;
                boolean allowPropertyOverride15 = parsingContext.getAllowPropertyOverride();
                ParsingContext parsingContextRestrictPropertyOverride15 = ParsingContextKt.restrictPropertyOverride(parsingContext);
                return new ok(JsonFieldParser.readField(parsingContextRestrictPropertyOverride15, jSONObject15, "id", allowPropertyOverride15, okVar != null ? okVar.f18038a : null), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride15, jSONObject15, "items", allowPropertyOverride15, okVar != null ? okVar.f18039b : null, this.f16995b.f18541t9));
            case 15:
                pk pkVar = (pk) entityTemplate;
                JSONObject jSONObject16 = (JSONObject) obj;
                boolean allowPropertyOverride16 = parsingContext.getAllowPropertyOverride();
                ParsingContext parsingContextRestrictPropertyOverride16 = ParsingContextKt.restrictPropertyOverride(parsingContext);
                Field field18 = pkVar != null ? pkVar.f18101a : null;
                sy syVar10 = this.f16995b;
                ij.p pVar4 = syVar10.A5;
                ij.p pVar5 = syVar10.f18453l1;
                zj zjVar = nk.f17975c;
                Intrinsics.c(zjVar, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
                return new pk(JsonFieldParser.readListField(parsingContextRestrictPropertyOverride16, jSONObject16, "changes", allowPropertyOverride16, field18, pVar4, zjVar), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride16, jSONObject16, "mode", nk.f17974b, allowPropertyOverride16, pkVar != null ? pkVar.f18102b : null, mg.B), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride16, jSONObject16, "on_applied_actions", allowPropertyOverride16, pkVar != null ? pkVar.f18103c : null, pVar5), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride16, jSONObject16, "on_failed_actions", allowPropertyOverride16, pkVar != null ? pkVar.f18104d : null, pVar5));
            case 16:
                ml mlVar = (ml) entityTemplate;
                JSONObject jSONObject17 = (JSONObject) obj;
                boolean allowPropertyOverride17 = parsingContext.getAllowPropertyOverride();
                ParsingContext parsingContextRestrictPropertyOverride17 = ParsingContextKt.restrictPropertyOverride(parsingContext);
                Field field19 = mlVar != null ? mlVar.f17876a : null;
                sy syVar11 = this.f16995b;
                return new ml(JsonFieldParser.readField(parsingContextRestrictPropertyOverride17, jSONObject17, "x", allowPropertyOverride17, field19, syVar11.M2), JsonFieldParser.readField(parsingContextRestrictPropertyOverride17, jSONObject17, "y", allowPropertyOverride17, mlVar != null ? mlVar.f17877b : null, syVar11.M2));
            case 17:
                ao aoVar = (ao) entityTemplate;
                JSONObject jSONObject18 = (JSONObject) obj;
                boolean allowPropertyOverride18 = parsingContext.getAllowPropertyOverride();
                ParsingContext parsingContextRestrictPropertyOverride18 = ParsingContextKt.restrictPropertyOverride(parsingContext);
                return new ao(JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride18, jSONObject18, ViewHierarchyNode.JsonKeys.ALPHA, TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride18, aoVar != null ? aoVar.f16837a : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, zn.f19278d), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride18, jSONObject18, "blur", TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride18, aoVar != null ? aoVar.f16838b : null, ParsingConvertersKt.NUMBER_TO_INT, zn.f19279e), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride18, jSONObject18, "color", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride18, aoVar != null ? aoVar.f16839c : null, ParsingConvertersKt.STRING_TO_COLOR_INT), JsonFieldParser.readField(parsingContextRestrictPropertyOverride18, jSONObject18, "offset", allowPropertyOverride18, aoVar != null ? aoVar.f16840d : null, this.f16995b.S5));
            case 18:
                kp kpVar = (kp) entityTemplate;
                JSONObject jSONObject19 = (JSONObject) obj;
                boolean allowPropertyOverride19 = parsingContext.getAllowPropertyOverride();
                ParsingContext parsingContextRestrictPropertyOverride19 = ParsingContextKt.restrictPropertyOverride(parsingContext);
                TypeHelper<Long> typeHelper7 = TypeHelpersKt.TYPE_HELPER_INT;
                Field field20 = kpVar != null ? kpVar.f17608a : null;
                Function1<Number, Long> function17 = ParsingConvertersKt.NUMBER_TO_INT;
                Field optionalFieldWithExpression9 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride19, jSONObject19, "end", typeHelper7, allowPropertyOverride19, field20, function17);
                Field field21 = kpVar != null ? kpVar.f17609b : null;
                sy syVar12 = this.f16995b;
                ij.p pVar6 = syVar12.Y2;
                ij.p pVar7 = syVar12.V2;
                return new kp(optionalFieldWithExpression9, JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride19, jSONObject19, "margins", allowPropertyOverride19, field21, pVar6), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride19, jSONObject19, "start", typeHelper7, allowPropertyOverride19, kpVar != null ? kpVar.f17610c : null, function17), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride19, jSONObject19, "track_active_style", allowPropertyOverride19, kpVar != null ? kpVar.f17611d : null, pVar7), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride19, jSONObject19, "track_inactive_style", allowPropertyOverride19, kpVar != null ? kpVar.f17612e : null, pVar7));
            case 19:
                lp lpVar = (lp) entityTemplate;
                JSONObject jSONObject20 = (JSONObject) obj;
                boolean allowPropertyOverride20 = parsingContext.getAllowPropertyOverride();
                ParsingContext parsingContextRestrictPropertyOverride20 = ParsingContextKt.restrictPropertyOverride(parsingContext);
                Field optionalFieldWithExpression10 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride20, jSONObject20, "font_family", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride20, lpVar != null ? lpVar.f17744a : null);
                TypeHelper<Long> typeHelper8 = TypeHelpersKt.TYPE_HELPER_INT;
                Field field22 = lpVar != null ? lpVar.f17745b : null;
                Function1<Number, Long> function18 = ParsingConvertersKt.NUMBER_TO_INT;
                return new lp(optionalFieldWithExpression10, JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride20, jSONObject20, "font_size", typeHelper8, allowPropertyOverride20, field22, function18, np.f18008g), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride20, jSONObject20, "font_size_unit", np.f18006e, allowPropertyOverride20, lpVar != null ? lpVar.f17746c : null, hn.f17349o), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride20, jSONObject20, "font_variation_settings", TypeHelpersKt.TYPE_HELPER_DICT, allowPropertyOverride20, lpVar != null ? lpVar.f17747d : null), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride20, jSONObject20, "font_weight", np.f18007f, allowPropertyOverride20, lpVar != null ? lpVar.f17748e : null, w9.f18848w), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride20, jSONObject20, "font_weight_value", typeHelper8, allowPropertyOverride20, lpVar != null ? lpVar.f17749f : null, function18, np.f18009h), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride20, jSONObject20, "letter_spacing", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride20, lpVar != null ? lpVar.f17750g : null, ParsingConvertersKt.NUMBER_TO_DOUBLE), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride20, jSONObject20, "offset", allowPropertyOverride20, lpVar != null ? lpVar.f17751h : null, this.f16995b.S5), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride20, jSONObject20, "text_color", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride20, lpVar != null ? lpVar.i : null, ParsingConvertersKt.STRING_TO_COLOR_INT));
            case 20:
                xp xpVar = (xp) entityTemplate;
                JSONObject jSONObject21 = (JSONObject) obj;
                boolean allowPropertyOverride21 = parsingContext.getAllowPropertyOverride();
                ParsingContext parsingContextRestrictPropertyOverride21 = ParsingContextKt.restrictPropertyOverride(parsingContext);
                Field field23 = xpVar != null ? xpVar.f19059a : null;
                sy syVar13 = this.f16995b;
                return new xp(JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride21, jSONObject21, "animation_in", allowPropertyOverride21, field23, syVar13.f18512r1), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride21, jSONObject21, "animation_out", allowPropertyOverride21, xpVar != null ? xpVar.f19060b : null, syVar13.f18512r1), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride21, jSONObject21, "div", allowPropertyOverride21, xpVar != null ? xpVar.f19061c : null, syVar13.f18541t9), JsonFieldParser.readField(parsingContextRestrictPropertyOverride21, jSONObject21, "state_id", allowPropertyOverride21, xpVar != null ? xpVar.f19062d : null), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride21, jSONObject21, "swipe_out_actions", allowPropertyOverride21, xpVar != null ? xpVar.f19063e : null, syVar13.f18453l1));
            case 21:
                uq uqVar = (uq) entityTemplate;
                JSONObject jSONObject22 = (JSONObject) obj;
                boolean allowPropertyOverride22 = parsingContext.getAllowPropertyOverride();
                ParsingContext parsingContextRestrictPropertyOverride22 = ParsingContextKt.restrictPropertyOverride(parsingContext);
                return new uq(JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride22, jSONObject22, "color", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride22, uqVar != null ? uqVar.f18706a : null, ParsingConvertersKt.STRING_TO_COLOR_INT), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride22, jSONObject22, "style", allowPropertyOverride22, uqVar != null ? uqVar.f18707b : null, this.f16995b.B7), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride22, jSONObject22, "unit", gq.f17305c, allowPropertyOverride22, uqVar != null ? uqVar.f18708c : null, hn.f17349o), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride22, jSONObject22, "width", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride22, uqVar != null ? uqVar.f18709d : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, gq.f17306d));
            case 22:
                mr mrVar = (mr) entityTemplate;
                JSONObject jSONObject23 = (JSONObject) obj;
                boolean allowPropertyOverride23 = parsingContext.getAllowPropertyOverride();
                ParsingContext parsingContextRestrictPropertyOverride23 = ParsingContextKt.restrictPropertyOverride(parsingContext);
                Field field24 = mrVar != null ? mrVar.f17912a : null;
                sy syVar14 = this.f16995b;
                return new mr(JsonFieldParser.readField(parsingContextRestrictPropertyOverride23, jSONObject23, "div", allowPropertyOverride23, field24, syVar14.f18541t9), JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride23, jSONObject23, "title", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride23, mrVar != null ? mrVar.f17913b : null), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride23, jSONObject23, "title_click_action", allowPropertyOverride23, mrVar != null ? mrVar.f17914c : null, syVar14.f18453l1));
            case 23:
                nr nrVar = (nr) entityTemplate;
                JSONObject jSONObject24 = (JSONObject) obj;
                boolean allowPropertyOverride24 = parsingContext.getAllowPropertyOverride();
                ParsingContext parsingContextRestrictPropertyOverride24 = ParsingContextKt.restrictPropertyOverride(parsingContext);
                Field field25 = nrVar != null ? nrVar.f18010a : null;
                sy syVar15 = this.f16995b;
                return new nr(JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride24, jSONObject24, "height", allowPropertyOverride24, field25, syVar15.f18564w3), JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride24, jSONObject24, "image_url", TypeHelpersKt.TYPE_HELPER_URI, allowPropertyOverride24, nrVar != null ? nrVar.f18011b : null, ParsingConvertersKt.ANY_TO_URI), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride24, jSONObject24, "width", allowPropertyOverride24, nrVar != null ? nrVar.f18012c : null, syVar15.f18564w3));
            case 24:
                or orVar = (or) entityTemplate;
                JSONObject jSONObject25 = (JSONObject) obj;
                boolean allowPropertyOverride25 = parsingContext.getAllowPropertyOverride();
                ParsingContext parsingContextRestrictPropertyOverride25 = ParsingContextKt.restrictPropertyOverride(parsingContext);
                TypeHelper<Integer> typeHelper9 = TypeHelpersKt.TYPE_HELPER_COLOR;
                Field field26 = orVar != null ? orVar.f18044a : null;
                Function1<Object, Integer> function19 = ParsingConvertersKt.STRING_TO_COLOR_INT;
                Field optionalFieldWithExpression11 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride25, jSONObject25, "active_background_color", typeHelper9, allowPropertyOverride25, field26, function19);
                TypeHelper<JSONObject> typeHelper10 = TypeHelpersKt.TYPE_HELPER_DICT;
                Field optionalFieldWithExpression12 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride25, jSONObject25, "active_font_variation_settings", typeHelper10, allowPropertyOverride25, orVar != null ? orVar.f18045b : null);
                TypeHelper typeHelper11 = lr.f17761k;
                Field field27 = orVar != null ? orVar.f18046c : null;
                w9 w9Var = w9.f18848w;
                Field optionalFieldWithExpression13 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride25, jSONObject25, "active_font_weight", typeHelper11, allowPropertyOverride25, field27, w9Var);
                Field optionalFieldWithExpression14 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride25, jSONObject25, "active_text_color", typeHelper9, allowPropertyOverride25, orVar != null ? orVar.f18047d : null, function19);
                TypeHelper<Long> typeHelper12 = TypeHelpersKt.TYPE_HELPER_INT;
                Field field28 = orVar != null ? orVar.f18048e : null;
                Function1<Number, Long> function110 = ParsingConvertersKt.NUMBER_TO_INT;
                Field optionalFieldWithExpression15 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride25, jSONObject25, "animation_duration", typeHelper12, allowPropertyOverride25, field28, function110, lr.f17766p);
                Field optionalFieldWithExpression16 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride25, jSONObject25, "animation_type", lr.f17762l, allowPropertyOverride25, orVar != null ? orVar.f18049f : null, hn.G);
                Field optionalFieldWithExpression17 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride25, jSONObject25, "corner_radius", typeHelper12, allowPropertyOverride25, orVar != null ? orVar.f18050g : null, function110, lr.f17767q);
                Field field29 = orVar != null ? orVar.f18051h : null;
                sy syVar16 = this.f16995b;
                return new or(optionalFieldWithExpression11, optionalFieldWithExpression12, optionalFieldWithExpression13, optionalFieldWithExpression14, optionalFieldWithExpression15, optionalFieldWithExpression16, optionalFieldWithExpression17, JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride25, jSONObject25, "corners_radius", allowPropertyOverride25, field29, syVar16.f18534t2), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride25, jSONObject25, "font_family", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride25, orVar != null ? orVar.i : null), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride25, jSONObject25, "font_size", typeHelper12, allowPropertyOverride25, orVar != null ? orVar.f18052j : null, function110, lr.f17768r), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride25, jSONObject25, "font_size_unit", lr.f17763m, allowPropertyOverride25, orVar != null ? orVar.f18053k : null, hn.f17349o), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride25, jSONObject25, "font_weight", lr.f17764n, allowPropertyOverride25, orVar != null ? orVar.f18054l : null, w9Var), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride25, jSONObject25, "inactive_background_color", typeHelper9, allowPropertyOverride25, orVar != null ? orVar.f18055m : null, function19), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride25, jSONObject25, "inactive_font_variation_settings", typeHelper10, allowPropertyOverride25, orVar != null ? orVar.f18056n : null), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride25, jSONObject25, "inactive_font_weight", lr.f17765o, allowPropertyOverride25, orVar != null ? orVar.f18057o : null, w9Var), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride25, jSONObject25, "inactive_text_color", typeHelper9, allowPropertyOverride25, orVar != null ? orVar.f18058p : null, function19), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride25, jSONObject25, "item_spacing", typeHelper12, allowPropertyOverride25, orVar != null ? orVar.f18059q : null, function110, lr.f17769s), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride25, jSONObject25, "letter_spacing", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride25, orVar != null ? orVar.f18060r : null, ParsingConvertersKt.NUMBER_TO_DOUBLE), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride25, jSONObject25, "line_height", typeHelper12, allowPropertyOverride25, orVar != null ? orVar.f18061s : null, function110, lr.f17770t), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride25, jSONObject25, "paddings", allowPropertyOverride25, orVar != null ? orVar.f18062t : null, syVar16.Y2));
            case 25:
                fu fuVar = (fu) entityTemplate;
                JSONObject jSONObject26 = (JSONObject) obj;
                boolean allowPropertyOverride26 = parsingContext.getAllowPropertyOverride();
                ParsingContext parsingContextRestrictPropertyOverride26 = ParsingContextKt.restrictPropertyOverride(parsingContext);
                Field field30 = fuVar != null ? fuVar.f17230a : null;
                sy syVar17 = this.f16995b;
                return new fu(JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride26, jSONObject26, "actions", allowPropertyOverride26, field30, syVar17.f18453l1), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride26, jSONObject26, DebugMeta.JsonKeys.IMAGES, allowPropertyOverride26, fuVar != null ? fuVar.f17231b : null, syVar17.f18549u8), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride26, jSONObject26, "ranges", allowPropertyOverride26, fuVar != null ? fuVar.f17232c : null, syVar17.r8), JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride26, jSONObject26, "text", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride26, fuVar != null ? fuVar.f17233d : null));
            case 26:
                hu huVar = (hu) entityTemplate;
                JSONObject jSONObject27 = (JSONObject) obj;
                boolean allowPropertyOverride27 = parsingContext.getAllowPropertyOverride();
                ParsingContext parsingContextRestrictPropertyOverride27 = ParsingContextKt.restrictPropertyOverride(parsingContext);
                Field field31 = huVar != null ? huVar.f17365a : null;
                sy syVar18 = this.f16995b;
                ij.p pVar8 = syVar18.f18580x8;
                ij.p pVar9 = syVar18.f18564w3;
                return new hu(JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride27, jSONObject27, "accessibility", allowPropertyOverride27, field31, pVar8), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride27, jSONObject27, "alignment_vertical", ws.f18930e, allowPropertyOverride27, huVar != null ? huVar.f17366b : null, kr.f17620o), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride27, jSONObject27, "height", allowPropertyOverride27, huVar != null ? huVar.f17367c : null, pVar9), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride27, jSONObject27, "indexing_direction", ws.f18931f, allowPropertyOverride27, huVar != null ? huVar.f17368d : null, kr.f17618m), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride27, jSONObject27, "preload_required", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride27, huVar != null ? huVar.f17369e : null, ParsingConvertersKt.ANY_TO_BOOLEAN), JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride27, jSONObject27, "start", TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride27, huVar != null ? huVar.f17370f : null, ParsingConvertersKt.NUMBER_TO_INT, ws.f18933h), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride27, jSONObject27, "tint_color", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride27, huVar != null ? huVar.f17371g : null, ParsingConvertersKt.STRING_TO_COLOR_INT), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride27, jSONObject27, "tint_mode", ws.f18932g, allowPropertyOverride27, huVar != null ? huVar.f17372h : null, v0.C), JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride27, jSONObject27, "url", TypeHelpersKt.TYPE_HELPER_URI, allowPropertyOverride27, huVar != null ? huVar.i : null, ParsingConvertersKt.ANY_TO_URI), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride27, jSONObject27, "width", allowPropertyOverride27, huVar != null ? huVar.f17373j : null, pVar9));
            case 27:
                jt jtVar = (jt) entityTemplate;
                JSONObject jSONObject28 = (JSONObject) obj;
                boolean allowPropertyOverride28 = parsingContext.getAllowPropertyOverride();
                ParsingContext parsingContextRestrictPropertyOverride28 = ParsingContextKt.restrictPropertyOverride(parsingContext);
                return new jt(JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride28, jSONObject28, "corner_radius", TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride28, jtVar != null ? jtVar.f17505a : null, ParsingConvertersKt.NUMBER_TO_INT, j6.f17476r), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride28, jSONObject28, "stroke", allowPropertyOverride28, jtVar != null ? jtVar.f17506b : null, this.f16995b.E7));
            case 28:
                return a(parsingContext, entityTemplate, obj);
            default:
                mu muVar = (mu) entityTemplate;
                JSONObject jSONObject29 = (JSONObject) obj;
                boolean allowPropertyOverride29 = parsingContext.getAllowPropertyOverride();
                ParsingContext parsingContextRestrictPropertyOverride29 = ParsingContextKt.restrictPropertyOverride(parsingContext);
                TypeHelper<Long> typeHelper13 = TypeHelpersKt.TYPE_HELPER_INT;
                Field field32 = muVar != null ? muVar.f17915a : null;
                Function1<Number, Long> function111 = ParsingConvertersKt.NUMBER_TO_INT;
                Field optionalFieldWithExpression18 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride29, jSONObject29, "duration", typeHelper13, allowPropertyOverride29, field32, function111, lu.f17775b);
                Field field33 = muVar != null ? muVar.f17916b : null;
                sy syVar19 = this.f16995b;
                return new mu(optionalFieldWithExpression18, JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride29, jSONObject29, "end_actions", allowPropertyOverride29, field33, syVar19.f18453l1), JsonFieldParser.readField(parsingContextRestrictPropertyOverride29, jSONObject29, "id", allowPropertyOverride29, muVar != null ? muVar.f17917c : null), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride29, jSONObject29, "tick_actions", allowPropertyOverride29, muVar != null ? muVar.f17918d : null, syVar19.f18453l1), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride29, jSONObject29, "tick_interval", typeHelper13, allowPropertyOverride29, muVar != null ? muVar.f17919e : null, function111, lu.f17776c), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride29, jSONObject29, "value_variable", allowPropertyOverride29, muVar != null ? muVar.f17920f : null));
        }
    }
}
