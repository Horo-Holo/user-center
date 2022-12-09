import {GithubOutlined} from '@ant-design/icons';
import {DefaultFooter} from '@ant-design/pro-layout';
import {PLANET_LINK} from "@/constants";

const Footer: React.FC = () => {
  const defaultMessage = 'Yuukin 出品';
  const currentYear = new Date().getFullYear();
  return (
    <DefaultFooter
      copyright={`${currentYear} ${defaultMessage}`}
      links={[
        {
          key: 'planet',
          title: 'BiliBili',
          href: PLANET_LINK,
          blankTarget: true,
        },
        {
          key: 'codeNav',
          title: '编程导航',
          href: 'https://www.nefu.edu.cn',
          blankTarget: true,
        },
        {
          key: 'github',
          title: <><GithubOutlined/> Yuukin GitHub</>,
          href: 'https://github.com/Horo-Holo',
          blankTarget: true,
        },

      ]}
    />
  );
};

export default Footer;
