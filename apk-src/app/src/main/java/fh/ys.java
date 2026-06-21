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
import io.sentry.protocol.DebugMeta;
import io.sentry.protocol.ViewHierarchyNode;
import java.util.List;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ys implements Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f19186a;

    public ys(sy syVar) {
        this.f19186a = syVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ps deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        sy syVar = this.f19186a;
        ij.p pVar = syVar.m9;
        ij.p pVar2 = syVar.z1;
        ij.p pVar3 = syVar.X2;
        ij.p pVar4 = syVar.T6;
        ij.p pVar5 = syVar.f18443k1;
        if (((u6) JsonPropertyParser.readOptional(parsingContext, jSONObject, "action_animation", syVar.f18503q1)) == null) {
            Expression expression = bt.f16956a;
        }
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "actions", pVar5);
        TypeHelper typeHelper = bt.f16971q;
        v0 v0Var = v0.f18733v;
        Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", typeHelper, v0Var);
        TypeHelper typeHelper2 = bt.f16972r;
        v0 v0Var2 = v0.f18734w;
        Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", typeHelper2, v0Var2);
        TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
        Function1<Number, Double> function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, ViewHierarchyNode.JsonKeys.ALPHA, typeHelper3, function1, bt.A, bt.f16956a);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", syVar.f18533t1);
        TypeHelper<Boolean> typeHelper4 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
        Function1<Object, Boolean> function12 = ParsingConvertersKt.ANY_TO_BOOLEAN;
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "auto_ellipsize", typeHelper4, function12);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, A2.f22054g, syVar.F1);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "capture_focus_on_action", typeHelper4, function12, bt.f16957b);
        TypeHelper<Long> typeHelper5 = TypeHelpersKt.TYPE_HELPER_INT;
        Function1<Number, Long> function13 = ParsingConvertersKt.NUMBER_TO_INT;
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper5, function13, bt.B);
        List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", syVar.O2);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "doubletap_actions", pVar5);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", syVar.f18335a3);
        TypeHelper<Integer> typeHelper6 = TypeHelpersKt.TYPE_HELPER_COLOR;
        Function1<Object, Integer> function14 = ParsingConvertersKt.STRING_TO_COLOR_INT;
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "focused_text_color", typeHelper6, function14);
        TypeHelper<String> typeHelper7 = TypeHelpersKt.TYPE_HELPER_STRING;
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_family", typeHelper7);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_feature_settings", typeHelper7);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_size", typeHelper5, function13, bt.C, bt.f16958c);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_size_unit", bt.f16973s, hn.f17349o, bt.f16959d);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_variation_settings", TypeHelpersKt.TYPE_HELPER_DICT);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_weight", bt.f16974t, w9.f18848w);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_weight_value", typeHelper5, function13, bt.D);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", syVar.H3);
        lo loVar = (lo) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", pVar4);
        if (loVar == null) {
            loVar = bt.f16960e;
        }
        lo loVar2 = loVar;
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "hover_end_actions", pVar5);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "hover_start_actions", pVar5);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, DebugMeta.JsonKeys.IMAGES, syVar.f18540t8);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "letter_spacing", typeHelper3, function1, bt.f16961f);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "line_height", typeHelper5, function13, bt.E);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "longtap_actions", pVar5);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "max_lines", typeHelper5, function13, bt.F);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "min_hidden_lines", typeHelper5, function13, bt.G);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "press_end_actions", pVar5);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "press_start_actions", pVar5);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "ranges", syVar.f18508q8);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", typeHelper7);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper5, function13, bt.H);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "selectable", typeHelper4, function12, bt.f16962g);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", pVar5);
        TypeHelper typeHelper8 = bt.f16975u;
        mg mgVar = mg.f17856o;
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "strike", typeHelper8, mgVar, bt.f16963h);
        JsonExpressionParser.readExpression(parsingContext, jSONObject, "text", typeHelper7);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "text_alignment_horizontal", bt.f16976v, v0Var, bt.i);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "text_alignment_vertical", bt.f16977w, v0Var2, bt.f16964j);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "text_color", typeHelper6, function14, bt.f16965k);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "tighten_width", typeHelper4, function12, bt.f16966l);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", syVar.O8);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", kv.f17646g, bt.I);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "truncate", bt.f16978x, kr.f17619n, bt.f16967m);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "underline", bt.f16979y, mgVar, bt.f16968n);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", syVar.U8);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", syVar.f18341a9);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, ViewHierarchyNode.JsonKeys.VISIBILITY, bt.f16980z, kv.f17653o, bt.f16969o);
        yw ywVar = (yw) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", pVar);
        List optionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", pVar);
        lo loVar3 = (lo) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", pVar4);
        if (loVar3 == null) {
            loVar3 = bt.f16970p;
        }
        return new ps(optionalExpression, optionalExpression2, optionalList, loVar2, ywVar, optionalList2, loVar3);
    }
}
