package fh;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import io.appmetrica.analytics.impl.A2;
import io.sentry.protocol.ViewHierarchyNode;
import io.sentry.rrweb.RRWebOptionsEvent;
import java.util.List;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class in implements Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f17395a;

    public in(sy syVar) {
        this.f17395a = syVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final gn deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        sy syVar = this.f17395a;
        ij.p pVar = syVar.m9;
        ij.p pVar2 = syVar.z1;
        ij.p pVar3 = syVar.X2;
        Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", ln.f17731j, v0.f18733v);
        Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", ln.f17732k, v0.f18734w);
        TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
        Function1<Number, Double> function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, ViewHierarchyNode.JsonKeys.ALPHA, typeHelper, function1, ln.f17736o, ln.f17723a);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", syVar.f18533t1);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, A2.f22054g, syVar.F1);
        TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
        Function1<Number, Long> function12 = ParsingConvertersKt.NUMBER_TO_INT;
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper2, function12, ln.f17737p);
        List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", syVar.O2);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", syVar.f18335a3);
        TypeHelper<String> typeHelper3 = TypeHelpersKt.TYPE_HELPER_STRING;
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_family", typeHelper3);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_size", typeHelper2, function12, ln.f17738q, ln.f17724b);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_size_unit", ln.f17733l, hn.f17349o, ln.f17725c);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_variation_settings", TypeHelpersKt.TYPE_HELPER_DICT);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_weight", ln.f17734m, w9.f18848w);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_weight_value", typeHelper2, function12, ln.f17739r);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", syVar.H3);
        ij.p pVar4 = syVar.T6;
        lo loVar = (lo) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", pVar4);
        if (loVar == null) {
            loVar = ln.f17726d;
        }
        lo loVar2 = loVar;
        TypeHelper<Integer> typeHelper4 = TypeHelpersKt.TYPE_HELPER_COLOR;
        Function1<Object, Integer> function13 = ParsingConvertersKt.STRING_TO_COLOR_INT;
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "hint_color", typeHelper4, function13, ln.f17727e);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "hint_text", typeHelper3);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "letter_spacing", typeHelper, function1, ln.f17728f);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "line_height", typeHelper2, function12, ln.f17740s);
        JsonPropertyParser.readList(parsingContext, jSONObject, RRWebOptionsEvent.EVENT_TAG, syVar.f18588y6, ln.f17741t);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", typeHelper3);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper2, function12, ln.f17742u);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", syVar.f18443k1);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "text_color", typeHelper4, function13, ln.f17729g);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", syVar.O8);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", kv.f17646g, ln.f17743v);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", syVar.U8);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", syVar.f18341a9);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, ViewHierarchyNode.JsonKeys.VISIBILITY, ln.f17735n, kv.f17653o, ln.f17730h);
        yw ywVar = (yw) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", pVar);
        List optionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", pVar);
        lo loVar3 = (lo) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", pVar4);
        if (loVar3 == null) {
            loVar3 = ln.i;
        }
        return new gn(optionalExpression, optionalExpression2, optionalList, loVar2, ywVar, optionalList2, loVar3);
    }
}
