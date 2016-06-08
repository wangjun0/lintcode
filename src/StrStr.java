/**
 * Created by Administrator on 2016/5/29.
 */
public class StrStr {
    /**
     * Returns a index to the first occurrence of target in source,
     * or -1  if target is not part of source.
     *
     * @param source string to be scanned.
     * @param target string containing the sequence of characters to match.
     */
   /* ����һ�������� source �ַ�����һ�� target �ַ�����
    ��Ӧ���� source �ַ������ҳ� target �ַ������ֵĵ�һ��λ��(��0��ʼ)����������ڣ��򷵻� -1��*/
    public int strStr(String source, String target) {
        //write your code here
        if (source == null || target == null || source.length() < target.length()) {
            return -1;
        }

        int sIndex = 0;
        int tIndex = 0;
        while (sIndex < source.length() && tIndex < target.length()) {
            if (source.charAt(sIndex) == target.charAt(tIndex)) {
                sIndex++;
                tIndex++;
            } else {
                sIndex = sIndex - tIndex + 1;
                tIndex = 0;
            }
        }
        if (tIndex >= target.length() - 1) {
            return sIndex - tIndex;
        } else {
            return -1;
        }
    }
}
