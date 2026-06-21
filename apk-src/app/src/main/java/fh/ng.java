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
import java.util.List;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ng implements Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f17971a;

    public ng(sy syVar) {
        this.f17971a = syVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final xf deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        sy syVar = this.f17971a;
        ij.p pVar = syVar.m9;
        ij.p pVar2 = syVar.z1;
        ij.p pVar3 = syVar.X2;
        TypeHelper typeHelper = qg.f18180q;
        v0 v0Var = v0.f18733v;
        Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", typeHelper, v0Var);
        TypeHelper typeHelper2 = qg.f18181r;
        v0 v0Var2 = v0.f18734w;
        Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", typeHelper2, v0Var2);
        TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
        Function1<Number, Double> function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, ViewHierarchyNode.JsonKeys.ALPHA, typeHelper3, function1, qg.A, qg.f18165a);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", syVar.f18533t1);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "autocapitalization", qg.f18182s, be.F, qg.f18166b);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, A2.f22054g, syVar.F1);
        TypeHelper<Long> typeHelper4 = TypeHelpersKt.TYPE_HELPER_INT;
        Function1<Number, Long> function12 = ParsingConvertersKt.NUMBER_TO_INT;
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper4, function12, qg.B);
        List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", syVar.O2);
        ij.p pVar4 = syVar.f18443k1;
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "enter_key_actions", pVar4);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "enter_key_type", qg.f18183t, be.G, qg.f18167c);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", syVar.f18335a3);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "filters", syVar.f18485o4);
        TypeHelper<String> typeHelper5 = TypeHelpersKt.TYPE_HELPER_STRING;
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_family", typeHelper5);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_size", typeHelper4, function12, qg.C, qg.f18168d);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_size_unit", qg.f18184u, hn.f17349o, qg.f18169e);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_variation_settings", TypeHelpersKt.TYPE_HELPER_DICT);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_weight", qg.f18185v, w9.f18848w);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_weight_value", typeHelper4, function12, qg.D);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", syVar.H3);
        ij.p pVar5 = syVar.T6;
        lo loVar = (lo) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", pVar5);
        if (loVar == null) {
            loVar = qg.f18170f;
        }
        lo loVar2 = loVar;
        TypeHelper<Integer> typeHelper6 = TypeHelpersKt.TYPE_HELPER_COLOR;
        Function1<Object, Integer> function13 = ParsingConvertersKt.STRING_TO_COLOR_INT;
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "highlight_color", typeHelper6, function13);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "hint_color", typeHelper6, function13, qg.f18171g);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "hint_text", typeHelper5);
        TypeHelper<Boolean> typeHelper7 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
        Function1<Object, Boolean> function14 = ParsingConvertersKt.ANY_TO_BOOLEAN;
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "is_enabled", typeHelper7, function14, qg.f18172h);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "keyboard_type", qg.f18186w, be.H, qg.i);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "letter_spacing", typeHelper3, function1, qg.f18173j);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "line_height", typeHelper4, function12, qg.E);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "max_length", typeHelper4, function12, qg.F);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "max_visible_lines", typeHelper4, function12, qg.G);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", typeHelper5);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper4, function12, qg.H);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "select_all_on_focus", typeHelper7, function14, qg.f18174k);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", pVar4);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "text_alignment_horizontal", qg.f18187x, v0Var, qg.f18175l);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "text_alignment_vertical", qg.f18188y, v0Var2, qg.f18176m);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "text_color", typeHelper6, function13, qg.f18177n);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", syVar.O8);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", kv.f17646g, qg.I);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "validators", syVar.A4);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", syVar.U8);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", syVar.f18341a9);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, ViewHierarchyNode.JsonKeys.VISIBILITY, qg.f18189z, kv.f17653o, qg.f18178o);
        yw ywVar = (yw) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", pVar);
        List optionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", pVar);
        lo loVar3 = (lo) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", pVar5);
        if (loVar3 == null) {
            loVar3 = qg.f18179p;
        }
        return new xf(optionalExpression, optionalExpression2, optionalList, loVar2, ywVar, optionalList2, loVar3);
    }
}
